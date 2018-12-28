package pl.kczk.przepisy.web.przepisycoresb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kczk.przepisy.web.przepisycoresb.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
