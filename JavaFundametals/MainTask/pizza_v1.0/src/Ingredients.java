import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by i on 02.07.2019.
 */
public class Ingredients {

    private LinkedHashMap<String, Float> ingredients = new LinkedHashMap<String, Float>();

    Ingredients() {
        ingredients.put("TomatoPaste", 1f);
        ingredients.put("Cheese", 1f);
        ingredients.put("Salami", 1.5f);
        ingredients.put("Bacon", 1.2f);
        ingredients.put("Garlic", 0.3f);
        ingredients.put("Corn", 0.7f);
        ingredients.put("Pepperoni", 0.6f);
        ingredients.put("Olives", 0.5f);
    }

    public Float getPrice(String s) {
        return ingredients.get(s);
    }
    public String getName(int key) {
        return ingredients.keySet().toArray()[key].toString();
    }
    public void showAllIngredient(){
        for( Map.Entry<String,Float> entry : ingredients.entrySet()){
            String key = entry.getKey();
            Float value = entry.getValue();
            System.out.println("ВВедите " + key + " чтобы выбрать" + "[" + key+ " : цена  " + value + "]"  );
        }
    }
    public int size() {
        return ingredients.size();
    }
    public void remove(String s) {
        ingredients.remove(s);
    }
}