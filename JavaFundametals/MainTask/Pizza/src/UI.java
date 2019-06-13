import java.sql.SQLOutput;
import java.util.Scanner;

public class UI {
    Order order;
    UI(){
        this.order = new Order();
        System.out.println("Номер вашего заказа: " + order.getOrderNumber());

        Scanner in = new Scanner(System.in);
        orderPizzaUIfirst();
        while ( order.getNumberOfPizza() < 10 ){
            int choose = in.nextInt();
            if (choose == 4){
                System.out.println("Обращайтесь к нам еще");
                break;
            }
            switch ( choose){
                case 1:
                    order.pizzaNameInOrder();
                    order.chooseIngredient();
                    order.choosedIngredient();
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:

                    break;
            }
            orderPizzaUIsecond();
            order.setNumberOfPizza();
            System.out.println("Количество заказнных пицц: " + order.getNumberOfPizza());

        }




    }


    private final void orderPizzaUIfirst(){
        System.out.println("Какую пиццу вы хотите заказать?\n" +
                "1. Простая пицца (Simple Pizza)\n" +
                "2. Изысканная пицца (Calzone Pizza)\n" +
                "3. Достаточно пицц\n" +
                "4. Выход (EXIT)");
    }


    private final void orderPizzaUIsecond(){
        System.out.println("Какую eще желаете пиццу заказать?\n" +
                "1. Простая пицца (Simple Pizza)\n" +
                "2. Изысканная пицца (Calzone Pizza)\n" +
                "3. Достаточно пицц\n" +
                "4. Выход (EXIT)");
    }

    private final void PizzaIngredientUI(){
        System.out.println("Какую eще желаете пиццу заказать?\n" +
                "1. Простая пицца (Simple Pizza)\n" +
                "2. Изысканная пицца (Calzone Pizza)\n" +
                "3. Достаточно пицц\n" +
                "4. Выход (EXIT)");
    }

}