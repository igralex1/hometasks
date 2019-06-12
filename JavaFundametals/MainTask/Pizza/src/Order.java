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

    // numberOrder
    // Pizza pizza
    private static int orderNumber;
    Client client = new Client();
    Pizza pizza = new Pizza();


    Order() {
        // Unique
        orderNumber++;
        pizzaNameInOrder();
    }

    // get return converting int to string
    public static String getOrderNumber() {
        String orderNumberString = String.format(" %05d%n", orderNumber );
        return orderNumberString;
    }

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




}