package ai.ecma.appeticketserver.repository;

import ai.ecma.appeticketserver.entity.ArtistEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * This interface not documented :(
 *
 * @author Muhammad Mo'minov
 * @since 04.01.2022
 */
public interface ArtistEventRepository extends JpaRepository<ArtistEvent, UUID> {
}
