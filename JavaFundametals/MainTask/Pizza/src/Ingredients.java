import com.sun.org.apache.bcel.internal.generic.FLOAD;

import java.util.*;

/**
 * Created by i on 12.06.2019.
 */
public class Ingredients {
    private LinkedHashMap<String, Float> ingredients = new LinkedHashMap<>();

    Ingredients() {
        ingredients.put("Tomato Paste", 1f);
        ingredients.put("Cheese", 1f);
        ingredients.put("Salami", 1.5f);
        ingredients.put("Bacon", 1.2f);
        ingredients.put("Garlic", 0.3f);
        ingredients.put("Corn", 0.7f);
        ingredients.put("Pepperoni", 0.6f);
        ingredients.put("Olives", 0.5f);
    }

    public Float getIngredientValue(String s) {
        return ingredients.get(s);
    }


    public String getIngredientKey(int key) {
        return ingredients.keySet().toArray()[key].toString();
    }
}


