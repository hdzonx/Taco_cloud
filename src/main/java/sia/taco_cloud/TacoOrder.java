package sia.taco_cloud;

import lombok.Data;
import java.util.List;
import java.util.ArrayList;

@Data
public class TacoOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Ingredients.Taco> tacos = new ArrayList<>();

    public void addTaco(Ingredients.Taco taco){
        this.tacos.add(taco);
    }
}
