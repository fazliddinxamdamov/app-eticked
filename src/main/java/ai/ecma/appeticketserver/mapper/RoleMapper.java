package ai.ecma.appeticketserver.mapper;

import ai.ecma.appeticketserver.entity.Category;
import ai.ecma.appeticketserver.entity.Role;
import ai.ecma.appeticketserver.enums.PermissionEnum;
import ai.ecma.appeticketserver.payload.req.RoleReqDto;
import ai.ecma.appeticketserver.payload.resp.CategoryRespDto;
import ai.ecma.appeticketserver.payload.resp.RoleRespDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

import java.util.Set;

import static org.mapstruct.ReportingPolicy.IGNORE;

/**
 * @author Osiyo Adilova
 * @project app-eticket-server
 * @since 12/16/2021
 */

@Mapper(unmappedTargetPolicy = IGNORE, componentModel = "spring")
@Component
public interface RoleMapper {

    RoleRespDto toRoleRespDto(Role role);

    @Mapping(source = "permissionEnum", target = "role.permissionEnums")
    Role toRole(@MappingTarget Role role,RoleReqDto roleReqDto,Set<PermissionEnum> permissionEnum);

    @Mapping(source = "permissionEnum", target = "permissionEnums")
    Role toRole(RoleReqDto roleReqDto,Set<PermissionEnum> permissionEnum);

}
