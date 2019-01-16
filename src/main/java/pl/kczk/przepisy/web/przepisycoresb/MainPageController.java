package pl.kczk.przepisy.web.przepisycoresb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.kczk.przepisy.web.przepisycoresb.entity.Ingredient;
import pl.kczk.przepisy.web.przepisycoresb.entity.Recipe;
import pl.kczk.przepisy.web.przepisycoresb.entity.RecipeToIngredient;
import pl.kczk.przepisy.web.przepisycoresb.service.CommonService;

import java.util.ArrayList;

@Controller
public class MainPageController {

    @Autowired
    CommonService commonService;

    @RequestMapping("/")
    @ResponseBody
    public String foo() {
        return "shooo shooo train";
    }

    @RequestMapping("/mock")
    public String mock( Model model) {
       // mockData();
        return "index";
    }
    @RequestMapping("/recipe")
    public String recipe( Model model) {
       // mockData();
        return "recipe";
    }
    private void mockData() {
        commonService.saveIngredient(Ingredient
                .builder()
                .name("truskawka")
                .build());
        commonService.saveIngredient(Ingredient
                .builder()
                .name("malina")
                .build());

        ArrayList<RecipeToIngredient> recipeToIngredientList = new ArrayList<RecipeToIngredient>();

        recipeToIngredientList.add(commonService.saveRecipeToIngredient(RecipeToIngredient
                .builder()
                .amount(5L)
                .ingredient(Ingredient
                        .builder()
                        .id(1L)
                        .build()
                )
                .build()));
        recipeToIngredientList.add(commonService.saveRecipeToIngredient(RecipeToIngredient
                .builder()
                .amount(7L)
                .ingredient(Ingredient
                        .builder()
                        .id(2L)
                        .build()
                )
                .build()));
        commonService.saveRecipe(Recipe
                        .builder()
                        .recipeToIngredients(recipeToIngredientList)
                        .name("potrawka z królika")
                        .build());
    }
}
