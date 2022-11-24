package part_1_2;

import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final String name;
    private final Set<Product> products;

    public Recipe (String name, Set<Product> product) {
        if (name == null || name.isBlank() || product == null || product.size() == 0) {
            throw new IllegalArgumentException("Все поля должны быть заполнены");
        }
        this.name = name;
        this.products = product;
    }

    public String getName () {
        return name;
    }

    public double getRecipePrice () {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public Set<Product> getProduct (){
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

