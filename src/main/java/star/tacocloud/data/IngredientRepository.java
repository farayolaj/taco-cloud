package star.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import star.tacocloud.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
