package ai.ecma.appeticketserver.repository;

import ai.ecma.appeticketserver.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

/**
 * This interface not documented :(
 *
 * @author Muhammad Mo'minov
 * @since 04.01.2022
 */
public interface ArtistRepository extends JpaRepository<Artist, UUID> {

    Optional<Artist> findByNameAndDeleted(String name, boolean deleted);
}
