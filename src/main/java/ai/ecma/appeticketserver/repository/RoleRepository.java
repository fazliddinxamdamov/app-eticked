package ai.ecma.appeticketserver.repository;

import ai.ecma.appeticketserver.entity.Category;
import ai.ecma.appeticketserver.entity.Role;
import ai.ecma.appeticketserver.enums.RoleEnum;
import ai.ecma.appeticketserver.payload.resp.RoleRespDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * @author Osiyo Adilova
 * @project app-eticket-server
 * @since 12/17/2021
 */

@Repository(value = "roleRepository")
public interface RoleRepository extends JpaRepository<Role, UUID> {

    boolean existsByName(String name);

    boolean existsByNameAndIdNot(String name, UUID id);

    Optional<Role> findByType(RoleEnum type);
}
