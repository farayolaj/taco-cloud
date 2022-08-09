package star.tacocloud;

public record Ingredient(String id, String name, star.tacocloud.Ingredient.Type type) {
  public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }
}
