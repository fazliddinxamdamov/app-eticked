package ai.ecma.appeticketserver.payload.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Map;

/**
 * @author Murtazayev Muhammad
 * @since 24.12.2021
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SeatReqDto {
    @NotBlank
    private String sectorName;

    private Map<String, Integer> row;


}
