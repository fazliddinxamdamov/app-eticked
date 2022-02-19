package ai.ecma.appeticketserver.payload.resp;

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
public interface TemplateResDto {
    UUID getId();

    String getName();

    Integer getCountChairs();

    Double getMaxPrice();
    Double getMinPrice();
}
