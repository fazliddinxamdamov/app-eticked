package ai.ecma.appeticketserver.payload.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * @author Murtazayev Muhammad
 * @since 20.12.2021
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EventSessionReqDto {
    @NotNull
    private UUID eventId;

    @NotNull
    private long startTime;

    @NotNull
    private long endTime;
}
