package pl.kczk.przepisy.web.przepisycoresb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kczk.przepisy.web.przepisycoresb.entity.Ingredient;
import pl.kczk.przepisy.web.przepisycoresb.entity.Recipe;
import pl.kczk.przepisy.web.przepisycoresb.entity.RecipeToIngredient;
import pl.kczk.przepisy.web.przepisycoresb.repository.IngredientRepository;
import pl.kczk.przepisy.web.przepisycoresb.repository.RecipeRepository;
import pl.kczk.przepisy.web.przepisycoresb.repository.RecipeToIngredientRepository;

@Service
public class CommonService {

    @Autowired
    RecipeToIngredientRepository recipeToIngredientRepository;
    @Autowired
    IngredientRepository ingredientRepository;
    @Autowired
    RecipeRepository recipeRepository;

    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public Ingredient saveIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    public RecipeToIngredient saveRecipeToIngredient(RecipeToIngredient recipeToIngredient) {
        return recipeToIngredientRepository.save(recipeToIngredient);
    }


}
