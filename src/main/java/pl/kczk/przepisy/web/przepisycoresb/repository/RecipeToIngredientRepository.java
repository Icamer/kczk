package pl.kczk.przepisy.web.przepisycoresb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kczk.przepisy.web.przepisycoresb.entity.RecipeToIngredient;

public interface RecipeToIngredientRepository extends JpaRepository<RecipeToIngredient, Long> {
}
