package ai.ecma.appeticketserver.payload.resp;

import ai.ecma.appeticketserver.enums.TicketStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * This class not documented :(
 *
 * @author Muhammad Mo'minov
 * @since 16.12.2021
 */

@Data
public class TicketHistoryRespDto {
    private UUID id;

    private UUID ticketId;

    private Timestamp actionTime;

    private TicketStatusEnum status;
}