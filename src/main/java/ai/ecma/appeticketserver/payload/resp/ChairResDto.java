package ai.ecma.appeticketserver.payload.resp;

import ai.ecma.appeticketserver.enums.TicketStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * This class not documented :(
 *
 * @author Muhammad Mo'minov
 * @since 23.12.2021
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChairResDto {
    private UUID id;
    private String name;
    private Double price;
    private TicketStatusEnum status;
}
