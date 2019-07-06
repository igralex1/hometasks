import java.util.ArrayList;

public class PizzaBuilder implements IBuilder{

    private String pizzaName;
    private ArrayList<String> pizzaIngredients = new ArrayList<String>();
    private String pizzaType;

    public String getPizzaName() {
        return pizzaName;
    }
    public PizzaBuilder name(String name){
        this.pizzaName = name;
        return this;
    }
    public PizzaBuilder type(String type){
        this.pizzaType = type;
        return this;
    }
    public PizzaBuilder addIngredient(String ingredientKey) {
        this.pizzaIngredients.add(ingredientKey);
        return this;
    }
    public PizzaBuilder setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
        return this;
    }
    public Pizza build(){
        return new Pizza(this);
    }
    public ArrayList<String> getPizzaIngredients() {
        return pizzaIngredients;
    }


    public String getPizzaType() {
        return pizzaType;
    }
}