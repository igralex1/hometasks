import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza extends AbstractPizza {


    private final Ingredients ingredients;

    private String pizzaName;
    private List<String> pizzaIngredients;
    private String pizzaType;
    private int numberOfPizza;


    Pizza() {
        //Реализовать соответствующий конструктор, в котором ингредиенты ещё не обозначены.
        pizzaIngredients= new ArrayList<String>();
        ingredients = new Ingredients();
    }

    @Override
    public String getPizzaName() {
        return this.pizzaName;
    }

    @Override
    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }


    @Override
    public List<String> getPizzaIngredients() {
        return pizzaIngredients;
    }

    @Override
    public void setPizzaIngredients(String ingredient) {
        pizzaIngredients.add(ingredient);
    }

    @Override
    public String getPizzaType() {
        return null;
    }

    @Override
    public void setPizzaType() {

    }

    //Клиенты могут также дать название своей пицце и заказать их в количестве до 10 штук.
    @Override
    public int getNumberOfPizza() {
        return 0;
    }

    @Override
    public void setNumberOfPizza() {

    }
}




