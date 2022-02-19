package ai.ecma.appeticketserver.mapper;

import ai.ecma.appeticketserver.entity.Role;
import ai.ecma.appeticketserver.entity.TicketHistory;
import ai.ecma.appeticketserver.enums.PermissionEnum;
import ai.ecma.appeticketserver.payload.req.RoleReqDto;
import ai.ecma.appeticketserver.payload.resp.RoleRespDto;
import ai.ecma.appeticketserver.payload.resp.TicketHistoryRespDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

import static org.mapstruct.ReportingPolicy.IGNORE;

/**
 * @author Osiyo Adilova
 * @project app-eticket-server
 * @since 12/16/2021
 */

@Mapper(unmappedTargetPolicy = IGNORE, componentModel = "spring")
@Component
public interface TicketHistoryMapper {

//    RoleRespDto toRoleRespDto(Role role);
//
//    @Mapping(source = "permissionEnum", target = "role.permissionEnums")
//    Role toRole(@MappingTarget Role role,RoleReqDto roleReqDto,Set<PermissionEnum> permissionEnum);
//
//    @Mapping(source = "permissionEnum", target = "permissionEnums")
//    Role toRole(RoleReqDto roleReqDto,Set<PermissionEnum> permissionEnum);

    @Mapping(source = "ticket.id", target = "ticketId")
    TicketHistoryRespDto toTicketHistoryRespDto(TicketHistory ticketHistory);

    @Mapping(source = "ticket.id", target = "ticketId")
    List<TicketHistoryRespDto> toTicketHistoryRespDtoList(List<TicketHistory> ticketHistory);

}
