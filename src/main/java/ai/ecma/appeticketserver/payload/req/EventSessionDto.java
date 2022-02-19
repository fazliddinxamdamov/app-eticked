package ai.ecma.appeticketserver.payload.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

/**
 * This class not documented :(
 *
 * @author Muhammad Mo'minov
 * @since 04.01.2022
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventSessionDto {
    @NotNull
    private Long startTime;

    @NotNull
    private Long endTime;
}
