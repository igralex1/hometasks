import com.sun.org.apache.xpath.internal.SourceTree;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 * Created by i on 30.06.2019.
 */
public class Order {
    private static int orderNumber;
    Client client;

    private ArrayList<Pizza> arrayListPizza = new ArrayList<Pizza>();
    private ArrayList<String> arrayListString = new ArrayList<String>();
    private int numberOfPIzza = 0;
    private float pizzaPrice = 1;

    public Order() {
        this.client = new Client();

        while (true) {
            System.out.println("Какую пиццу вы хотите заказать???");
            System.out.println("1 - Заказать/изменить Simple пиццу");
            System.out.println("2 - Calzone");
            System.out.println("3 - Удаление пиццы из заказа");
            System.out.println("0 - exit");


                Scanner in = new Scanner(System.in);
                int choose = in.nextInt();
                try{
                    switch (choose)
                    {
                        case 1:
                            PizzaBuilder pizzaBuilder = new PizzaBuilder();

                            pizzaBuilder.name(pizzaName());
                            chooseIngredient(pizzaBuilder);

                            Pizza p1 = new Pizza(pizzaBuilder);

                            // Удалить  после релиза
                            System.out.println(
                                    p1.getPizzaIngredients()+
                                            p1.getPizzaName()
                            );
                            arrayListPizza.add(pizzaBuilder.build());
                            break;
                        case 2:
                            PizzaBuilder margaritaBuilder = new PizzaBuilder();
                            margaritaBuilder.name("Margaritta")
                                    .addIngredient("TomatoPaste")
                                    .addIngredient("Garlic")
                                    .addIngredient("Ham")
                                    .setPizzaType("Calzone")
                                    .build();
                            Pizza margaritta = new Pizza(margaritaBuilder);
                            System.out.println("Margarita create");

                            arrayListPizza.add(margaritta);
                            pizzaPrice+=0.5;
                            numberOfPIzza++;
                            break;
                        case 3:
                            System.out.println("Какую пиццу удалить?");
                            for (Pizza pizza : arrayListPizza) {
                                System.out.print(arrayListPizza.indexOf(pizza));
                                System.out.println( " - " + pizza.getPizzaName());
                            }
                            arrayListPizza.remove(new Scanner(System.in).nextInt());
                            numberOfPIzza--;
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Неверный выбор");
                            break;
                    }
                }
                catch (Exception e){
                    System.out.println(e);
                }
                if (choose == 0) {
                    break;
                }
        }
        getOrder();
    }

    public static String getOrderNumber() {
        Random rand = new Random();
        return String.format("%05d%n", rand.nextInt(99999)).trim();
    }
    public String pizzaName() {
        System.out.println("Дайте название вашей пиццы: ");
        Scanner scannerPizzaName = new Scanner(System.in);
        String pizzaNameSet = scannerPizzaName.next();
//    Проверить, что название пиццы содержит не менее 4 и не более 20 латинских символов.
//    Если указанное название не удовлетворяет данному условию, пицца получает название
//    «имя_клиента_n», где n - номер пиццы по порядку в заказе.
        numberOfPIzza++;
        if (pizzaNameSet.length() > 4 && pizzaNameSet.length() < 20) {

            return pizzaNameSet;
        } else {
            String name = client.getClientName() + " " + numberOfPIzza;
            return name;
        }

    }
    public void getOrder() {
        convertPizzaArray();

        System.out.println( "[Заказ : Клиент : Название : Количество]");
        System.out.println("["+ getOrderNumber() + ":"
                              + client.getClientName() + ":"
                              + arrayListString  + ":"
                              + numberOfPIzza + "]");

        System.out.println(" ********************************");
        System.out.println(" Заказ: " + getOrderNumber());
        System.out.println(" Клиент: " + client.getClientName());
        System.out.println(" Название: " + arrayListString);
        System.out.println(" -------------------------------- " );
        System.out.println(" Ингредиенты: " + getOrderNumber());
        System.out.println(" -------------------------------- " );
        System.out.println(" Всего (цена за конкретную пиццу): " + pizzaPrice);
        System.out.println(" Количество конкретной пиццы: " + numberOfPIzza);
        System.out.println(" -------------------------------- " );
        System.out.println(" Общая сумма: " + getOrderNumber());





        for (Pizza pizza : arrayListPizza) {
            System.out.println(pizza.getPizzaIngredients());
        }
    }


    public void chooseIngredient(PizzaBuilder pizzaBuilder) {

        Ingredients ingredients = new Ingredients();
        ingredients.showAllIngredient();
            Scanner add = new Scanner(System.in);
            while (ingredients.size() > 0){
                String s = add.next().toString();
                switch (s){
                    case "TomatoPaste":
                        if (pizzaBuilder.getPizzaIngredients().contains(s)){
                            System.out.println("Ингредиент"+ s +" уже есть");
                            break;
                        }
                        pizzaBuilder.addIngredient(s).build();
                        pizzaPrice += ingredients.getPrice(s);
                        ingredients.remove(s);
                        break;
                    case "Cheese":
                        if (pizzaBuilder.getPizzaIngredients().contains(s)){
                            System.out.println("Ингредиент"+ s +" уже есть");
                            break;
                        }
                        pizzaBuilder.addIngredient(s).build();
                        pizzaPrice += ingredients.getPrice(s);
                        ingredients.remove(s);
                        break;
                    case "Salami":
                        if (pizzaBuilder.getPizzaIngredients().contains(s)){
                            System.out.println("Ингредиент"+ s +" уже есть");
                            break;
                        }
                        pizzaBuilder.addIngredient(s).build();
                        pizzaPrice += ingredients.getPrice(s);
                        ingredients.remove(s);
                        break;
                    case "Bacon":
                        if (pizzaBuilder.getPizzaIngredients().contains(s)){
                            System.out.println("Ингредиент"+ s +" уже есть");
                            break;
                        }
                        pizzaBuilder.addIngredient(s).build();
                        pizzaPrice += ingredients.getPrice(s);
                        ingredients.remove(s);
                        break;
                    case "Garlic":
                        if (pizzaBuilder.getPizzaIngredients().contains(s)){
                            System.out.println("Ингредиент"+ s +" уже есть");
                            break;
                        }
                        pizzaBuilder.addIngredient(s).build();
                        pizzaPrice += ingredients.getPrice(s);
                        ingredients.remove(s);
                        break;
                    case "Corn":
                        if (pizzaBuilder.getPizzaIngredients().contains(s)){
                            System.out.println("Ингредиент"+ s +" уже есть");
                            break;
                        }
                        pizzaBuilder.addIngredient(s).build();
                        pizzaPrice += ingredients.getPrice(s);
                        ingredients.remove(s);
                        break;
                    case "Pepperoni":
                        if (pizzaBuilder.getPizzaIngredients().contains(s)){
                            System.out.println("Ингредиент"+ s +" уже есть");
                            break;
                        }
                        pizzaBuilder.addIngredient(s).build();
                        pizzaPrice += ingredients.getPrice(s);
                        ingredients.remove(s);
                        break;
                    case "Olives":
                        if (pizzaBuilder.getPizzaIngredients().contains(s)){
                            System.out.println("Ингредиент"+ s +" уже есть");
                            break;
                        }
                        pizzaBuilder.addIngredient(s).build();
                        pizzaPrice += ingredients.getPrice(s);
                        ingredients.remove(s);
                        break;
                }
                if (s.equals("exit")){
                    break;
                }
                System.out.println("Введите слово \"exit\" для выхода");
                ingredients.showAllIngredient();
            }
            System.out.println("Ингредиенты в моей пицце : " + pizzaBuilder.getPizzaIngredients());
    }
    public void convertPizzaArray(){
        for (Pizza pizza : arrayListPizza) {
           // System.out.println(pizza.getPizzaName());
            arrayListString.add(pizza.getPizzaName());
        }
    }

}


