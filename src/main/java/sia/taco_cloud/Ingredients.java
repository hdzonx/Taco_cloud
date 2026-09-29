package sia.taco_cloud;

import java.util.List;

public class Ingredients {
    private final String id;
    private final String name;
    private final Type type;

    public Ingredients(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Type getType() { return type; }

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

    public static class Taco {
        private String name;
        private List<Ingredients> ingredients;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public List<Ingredients> getIngredients() { return ingredients; }
        public void setIngredients(List<Ingredients> ingredients) { this.ingredients = ingredients; }
    }
}