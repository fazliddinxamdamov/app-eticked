package ai.ecma.appeticketserver.mapper;

import ai.ecma.appeticketserver.entity.TemplateChair;
import ai.ecma.appeticketserver.payload.resp.ChairResDto;
import org.mapstruct.Mapper;

/**
 * This enum not documented :(
 *
 * @author Muhammad Mo'minov
 * @since 23.12.2021
 */
@Mapper(componentModel = "spring")
public interface TemplateChairMapper {
    ChairResDto toDto(TemplateChair chair);
}
