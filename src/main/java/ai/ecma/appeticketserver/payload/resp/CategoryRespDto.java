package ai.ecma.appeticketserver.payload.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * This class not documented :(
 *
 * @author Muhammad Mo'minov
 * @since 16.12.2021
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryRespDto {
    private UUID id;

    private String name;

    private UUID parentCategoryId;//todo
}