import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza extends AbstractPizza  {


    Ingredients ingredients = new Ingredients();




    private double pizzaPrice;
    private String pizzaName;
    private List<String> pizzaIngredients = new ArrayList<String>();
    private String pizzaType;
    private int numberOfPizza;



    Pizza(){
        //Реализовать соответствующий конструктор, в котором ингредиенты ещё не обозначены.
        pizzaIngredients = null;
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
    public String[] getPizzaIngredients() {
        return new String[0];
    }

    @Override
    public void setPizzaIngredients() {

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

//        Tomato Paste     1€
//        Cheese           1€
//        Salami           1,5€
//        Bacon            1,2€
//        Garlic           0,3€
//        Corn             0,7€
//        Pepperoni        0,6€
//        Olives           0,5€


//    public double takeIngredient(Ingredients i) {
//        switch (i.  ){
//
//            case TOMATOPASTE:
//                    Ingredient inf = new Ingredient(Ingredient.valueOf("TOMATOPASTE").toString());
//
//                System.out.println(s);
//                pizzaIngredients.add(s);
//                pizzaPrice += 1;
//                break;

//            case CHEESE:
//                pizzaPrice += 1;
//                break;
//
//            case SALAMI:
//                pizzaPrice += 1.5;
//                break;
//
//            case BACON:
//                pizzaPrice += 1.2;
//                break;
//
//            case GARLIC:
//                pizzaPrice += 0.3;
//                break;
//
//            case CORN:
//                pizzaPrice += 0.7;
//                break;
//
//            case PEPPERONI:
//                pizzaPrice += 0.6;
//                break;
//
//            case OLIVES:
//                pizzaPrice += 0.5;
//                break;

        }
//        System.out.println(pizzaIngredients);
//        return pizzaPrice;
//    }
//
//}