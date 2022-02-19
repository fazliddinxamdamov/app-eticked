package ai.ecma.appeticketserver.mapper;

import ai.ecma.appeticketserver.entity.EventSession;
import ai.ecma.appeticketserver.payload.resp.EventSessionRespDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import static org.mapstruct.ReportingPolicy.IGNORE;

/**
 * @author Murtazayev Muhammad
 * @since 20.12.2021
 */
@Mapper(unmappedTargetPolicy = IGNORE, componentModel = "spring")
@Component
public interface EventSessionMapper {
    EventSessionRespDto toEventSessionRespDto(EventSession eventSession);
}
