package part_1_2;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {

    private final Set<Recipe> recipes = new HashSet<>();

    public void addRecipe(Recipe recipe) {
        if (this.recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть.");
        } else {
            this.recipes.add(recipe);
        }
    }
}
