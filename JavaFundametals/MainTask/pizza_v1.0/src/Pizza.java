import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Pizza  {
    private String pizzaName;
    private ArrayList<String> pizzaIngredients;
    private String pizzaType;
    Pizza(PizzaBuilder pizzabuilder) {
        this.pizzaName = pizzabuilder.getPizzaName();
        this.pizzaIngredients = pizzabuilder.getPizzaIngredients();
        this.pizzaType = pizzabuilder.getPizzaType();
    }
    public String getPizzaName() {
        return pizzaName;
    }
    public ArrayList<String> getPizzaIngredients() {
        return pizzaIngredients;
    }
}




