package ai.ecma.appeticketserver.payload.req;

import ai.ecma.appeticketserver.enums.PermissionEnum;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Set;
@Getter
@Setter
public class RoleReqDto {

    @NotBlank(message = "{ROLE_NAME_REQUIRED}")
    private String name;

    private String description;


}
