package sia.taco_cloud.web;

import org.jspecify.annotations.NonNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sia.taco_cloud.Ingredients;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredients> {
private Map<String, Ingredients> ingredientMap = new HashMap<>();

    public IngredientByIdConverter() {
        ingredientMap.put("FLTO", new Ingredients("FLTO","Flour Tortilla", Ingredients.Type.WRAP));
        ingredientMap.put("COTO", new Ingredients("COTO","Corn Tortilla", Ingredients.Type.WRAP));
        ingredientMap.put("GRBF", new Ingredients("GRBF","Ground Beef", Ingredients.Type.PROTEIN));
        ingredientMap.put("CARN", new Ingredients("CARN","Carnitas", Ingredients.Type.PROTEIN));
        ingredientMap.put("TMTO", new Ingredients("TMTO","Diced Tomatoes", Ingredients.Type.VEGGIES));
        ingredientMap.put("LETC", new Ingredients("LETC","Lettuce", Ingredients.Type.VEGGIES));
        ingredientMap.put("CHED", new Ingredients("CHED","Cheddar", Ingredients.Type.CHEESE));
        ingredientMap.put("JACK", new Ingredients("JACK","Monterrey Jack", Ingredients.Type.CHEESE));
        ingredientMap.put("SLSA", new Ingredients("SLSA","Salsa", Ingredients.Type.SAUCE));
        ingredientMap.put("SRCR", new Ingredients("SRCR","Sour Cream", Ingredients.Type.SAUCE));
    }
    @Override
    public Ingredients convert(@NonNull String id){
        return ingredientMap.get(id);
    }

}
