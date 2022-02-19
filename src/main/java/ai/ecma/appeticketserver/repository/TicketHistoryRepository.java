package ai.ecma.appeticketserver.repository;

import ai.ecma.appeticketserver.entity.Role;
import ai.ecma.appeticketserver.entity.Ticket;
import ai.ecma.appeticketserver.entity.TicketHistory;
import ai.ecma.appeticketserver.payload.resp.RoleRespDto;
import ai.ecma.appeticketserver.payload.resp.TicketHistoryRespDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * @author Osiyo Adilova
 * @project app-eticket-server
 * @since 12/17/2021
 */

@Repository(value = "TicketHistoryRepository")
public interface TicketHistoryRepository extends JpaRepository<TicketHistory, UUID> {

    Page<TicketHistory> getAllByTicketId(UUID ticket_id, Pageable pageable);


}
