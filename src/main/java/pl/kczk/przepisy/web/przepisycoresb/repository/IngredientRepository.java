package pl.kczk.przepisy.web.przepisycoresb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kczk.przepisy.web.przepisycoresb.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
