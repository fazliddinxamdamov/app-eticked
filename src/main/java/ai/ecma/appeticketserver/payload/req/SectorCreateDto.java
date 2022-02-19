package ai.ecma.appeticketserver.payload.req;

import ai.ecma.appeticketserver.enums.TicketStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * This class not documented :(
 *
 * @author Muhammad Mo'minov
 * @since 24.12.2021
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SectorCreateDto {
    @NotNull
    private UUID templateId;

    @NotBlank
    private String sectorName;

    @NotNull
    private Integer rowCount;

    @NotNull
    private Integer chairCount;

    @NotNull
    private Double price;

    @NotNull
    private TicketStatusEnum status;
}
