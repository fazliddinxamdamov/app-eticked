package ai.ecma.appeticketserver.payload.resp;

import ai.ecma.appeticketserver.enums.PermissionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
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
public class RoleRespDto {
    private UUID id;

    private String name;

    private String description;

    private Set<PermissionEnum> permissionEnums;

}