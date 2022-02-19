package ai.ecma.appeticketserver.payload.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This class not documented :(
 *
 * @author Muhammad Mo'minov
 * @since 23.12.2021
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RowDto {
    private String name;
    private List<ChairResDto> chairs;
}
