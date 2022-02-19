package ai.ecma.appeticketserver.repository;

import ai.ecma.appeticketserver.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Osiyo Adilova
 * @project app-eticket-server
 * @since 12/17/2021
 */

@Repository(value = "categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, UUID> {

    boolean existsByNameAndParentCategoryId(String name, UUID parentCategory_id);
}
