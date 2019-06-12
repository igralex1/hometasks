import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by i on 11.06.2019.
 */
public class Order {

    private static int orderNumber;
    Client client = new Client();
    private final Pizza pizza = new Pizza();
    private float pizzaPrice;

    Order() {
        // Unique
        //orderNumber++;
        //pizzaNameInOrder();
        chooseIngredient();
    }

    // Format Order : 0000X
    public static String getOrderNumber() {
        String orderNumberString = String.format(" %05d%n", orderNumber );
        return orderNumberString;
    }

    // Condition to select pizza's name
    public void pizzaNameInOrder(){
        System.out.println("Please name your pizza: ");
        Scanner scannerPizzaName = new Scanner(System.in);
        String pizzaNameInOrder = scannerPizzaName.next();
//    Проверить, что название пиццы содержит не менее 4 и не более 20 латинских символов.
//    Если указанное название не удовлетворяет данному условию, пицца получает название
//    «имя_клиента_n», где n - номер пиццы по порядку в заказе.

        if(pizzaNameInOrder.length() > 4  && pizzaNameInOrder.length() < 20){
            pizza.setPizzaName(pizzaNameInOrder);
        }
        else{
            pizza.setPizzaName("\"" + client.getClientName() + "\" " + orderNumber);
        }
    }

    // Choose ingredients from pizza.ingredients(HashMap)
    public void chooseIngredient() {
            Ingredients ingredients = new Ingredients();
//        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Choose pizza component:\n " +
                "0. Tomato Paste     1€  \n " +
                "1. Cheese           1€  \n " +
                "2. Salami           1,5€\n" +
                "3. Bacon            1,2€\n " +
                "4. Garlic           0,3€\n" +
                "5. Corn             0,7€\n " +
                "6. Pepperoni        0,6€\n " +
                "7. Olives           0,5€\n " +
                "default (Press any number). Add your ingredients +0.5€\n...");

        int choose = in.nextInt();
        switch(choose) {
            case 0:
                // Add in pizza ingredient
                pizza.setPizzaIngredients(ingredients.getIngredientKey(0).toString());
                System.out.println(pizza.getPizzaIngredients());
                // Add price for ingredient
                pizzaPrice += ingredients.getIngredientValue("Tomato Paste");
                System.out.println(pizzaPrice);
                break;
            case 1:
                // Add in pizza ingredient
                pizza.setPizzaIngredients(ingredients.getIngredientKey(1).toString());
                System.out.println(pizza.getPizzaIngredients());
                // Add price for ingredient
                pizzaPrice += ingredients.getIngredientValue("Cheese");
                System.out.println(pizzaPrice);
                break;
            case 2:
                // Add in pizza ingredient
                pizza.setPizzaIngredients(ingredients.getIngredientKey(2).toString());
                System.out.println(pizza.getPizzaIngredients());
                // Add price for ingredient
                pizzaPrice += ingredients.getIngredientValue("Salami");
                System.out.println(pizzaPrice);
                break;
            case 3:
                // Add in pizza ingredient
                pizza.setPizzaIngredients(ingredients.getIngredientKey(3).toString());
                System.out.println(pizza.getPizzaIngredients());
                // Add price for ingredient
                pizzaPrice += ingredients.getIngredientValue("Bacon");
                System.out.println(pizzaPrice);
                break;
            case 4:
                // Add in pizza ingredient
                pizza.setPizzaIngredients(ingredients.getIngredientKey(4).toString());
                System.out.println(pizza.getPizzaIngredients());
                // Add price for ingredient
                pizzaPrice += ingredients.getIngredientValue("Garlic");
                System.out.println(pizzaPrice);
                break;
            case 5:
                // Add in pizza ingredient
                pizza.setPizzaIngredients(ingredients.getIngredientKey(5).toString());
                System.out.println(pizza.getPizzaIngredients());
                // Add price for ingredient
                pizzaPrice += ingredients.getIngredientValue("Corn");
                System.out.println(pizzaPrice);
                break;
            case 6:
                // Add in pizza ingredient
                pizza.setPizzaIngredients(ingredients.getIngredientKey(6).toString());
                System.out.println(pizza.getPizzaIngredients());
                // Add price for ingredient
                pizzaPrice += ingredients.getIngredientValue("Pepperoni");
                System.out.println(pizzaPrice);
                break;
            case 7:
                // Add in pizza ingredient
                pizza.setPizzaIngredients(ingredients.getIngredientKey(7).toString());
                System.out.println(pizza.getPizzaIngredients());
                // Add price for ingredient
                pizzaPrice += ingredients.getIngredientValue("Olives");
                System.out.println(pizzaPrice);
                break;

            default:
                System.out.println("add pizza");
                //add new user ingredient method Scanner in system

        }


    }



}