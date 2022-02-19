package ai.ecma.appeticketserver.common;

import ai.ecma.appeticketserver.repository.BasketRepository;
import ai.ecma.appeticketserver.repository.TicketRepository;
import ai.ecma.appeticketserver.service.TicketService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * This class not documented :(
 *
 * @author Muhammad Mo'minov
 * @since 04.01.2022
 */
@EnableScheduling
@Component
@RequiredArgsConstructor
public class ScheduledComponent {
    private final BasketRepository basketRepository;

    @Scheduled(fixedRate = 60000)
    public void clearBasket(){
        basketRepository.clearBasket(new Timestamp(System.currentTimeMillis()));
    }

//    @Scheduled(fixedRate = 5000)
//    @SneakyThrows
//    public void fixedDelay(){
//        System.out.println("Kod boshlandi: "+new Timestamp(System.currentTimeMillis()));
//        long currentTimeMillis = System.currentTimeMillis();
//        while (System.currentTimeMillis() - currentTimeMillis < 3000){
//            System.out.print("");
//        }
//        System.out.println("Uyg'ondi "+ new Timestamp(System.currentTimeMillis()));
//    }


}
