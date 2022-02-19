package ai.ecma.appeticketserver.service;

import ai.ecma.appeticketserver.common.MessageService;
import ai.ecma.appeticketserver.entity.*;
import ai.ecma.appeticketserver.enums.TicketStatusEnum;
import ai.ecma.appeticketserver.exception.RestException;
import ai.ecma.appeticketserver.payload.ApiResult;
import ai.ecma.appeticketserver.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * This class not documented :(
 *
 * @author Muhammad Mo'minov
 * @since 04.01.2022
 */
@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;
    private final ReturnTariffRepository returnTariffRepository;
    private final EventRepo eventRepo;
    private final PaymentRepository paymentRepository;
    private final TicketHistoryRepository ticketHistoryRepository;
    private final TicketPaymentRepository ticketPaymentRepository;


    @Override
    public Ticket chairToTicket(TemplateChair chair, EventSession eventSession) {
        return new Ticket(
                chair.getName(), eventSession, chair.getSector(), chair.getRow(), chair.getPrice(), chair.getStatus(), null
        );
    }

    @Override
    public List<Ticket> chairsToTickets(List<TemplateChair> chairs, EventSession eventSession) {
        return chairs.stream().map(chair -> chairToTicket(chair, eventSession)).collect(Collectors.toList());
    }

    @Transactional
    @Override
    public ApiResult<?> cancel(User user, UUID ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElseThrow(() -> RestException.notFound(MessageService.getMessage("TICKET_NOT_FOUND")));
        EventSession eventSession = ticket.getEventSession();
        Event event = eventRepo.findSessionsId(eventSession.getId());
        if (eventSession.getStartTime().after(Timestamp.valueOf(LocalDateTime.now())))
            throw RestException.restThrow(MessageService.getMessage("EVENT_SESSION_STARTED"), HttpStatus.BAD_REQUEST);

        if (!ticket.getStatus().equals(TicketStatusEnum.SOLD)){
            throw RestException.restThrow(MessageService.getMessage("TICKET_IS_NOT_SOLD"), HttpStatus.BAD_REQUEST);
        }

        Payment payment = paymentRepository.findByTicketId(ticket.getId());
        if (payment.getUser().getId() != user.getId()){
            throw RestException.restThrow(MessageService.getMessage("THIS_TICKET_NOT_YOURS"), HttpStatus.FORBIDDEN);
        }

//        if (!event.getHasReturning() || !returnTariffRepository.existsByEventId(event.getId())) {
////userdan ticketni olib qayta sotuvga qoyish
//
//        } else {
////mavjud tarifni topish
//        }

        ticket.setStatus(TicketStatusEnum.AVAILABLE);
        TicketHistory ticketHistory = new TicketHistory();
        ticketHistory.setTicket(ticket);
        ticketHistory.setStatus(TicketStatusEnum.AVAILABLE);
        ticketHistoryRepository.save(ticketHistory);

        TicketPayment ticketPayment = ticketPaymentRepository.findByTicketId(ticket.getId());
        ticketPayment.setCancelled(true);
        ticketPaymentRepository.save(ticketPayment);

        return ApiResult.successResponse("TICKET_SUCCESS_CANCELED");
    }
}
