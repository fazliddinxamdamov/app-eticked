package ai.ecma.appeticketserver.repository;

import ai.ecma.appeticketserver.entity.EventSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Murtazayev Muhammad
 * @since 20.12.2021
 */
@Repository
public interface EventSessionRepo extends JpaRepository<EventSession, UUID> {

}
