package ai.ecma.appeticketserver.payload.req;

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
 * @since 23.12.2021
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TemplateCreateDto {
    @NotBlank(message = "TEMPLATE_NAME_REQUIRED")
    private String name;

//    @NotNull(message = "TEMPLATE_SCHEMA_REQUIRED")
    private UUID schemaId;
}
