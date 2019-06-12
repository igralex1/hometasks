import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
       // Order order1 = new Order();

       // Order order2 = new Order();

//        System.out.println(order1.client.getClientName());
//        System.out.println(order1.pizza.getPizzaName());
//
//        System.out.println(order2.client.getClientName());
//        System.out.println(order2.pizza.getPizzaName());

        HashMap<String, String> newMap = new HashMap<String, String>();
        newMap.put("my_code", "shhh_secret");
        String value = newMap.get("my_code");



    }
}

//
// Каждая заказанная пицца имеет автоматически присвоенный,
// не подлежащий изменению пятизначный номер заказа, который сохраняется автоматически.
// Пицца может быть двух видов: обычной и закрытой (Calzone).
// Клиенты могут также дать название своей пицце и заказать их в количестве до 10 штук.
// В настоящее время возможно использование 7 разных ингредиентов для изготовления пиццы (в таблице указана цена):
//        Tomato Paste     1€
//        Cheese           1€
//        Salami           1,5€
//        Bacon            1,2€
//        Garlic           0,3€
//        Corn             0,7€
//        Pepperoni        0,6€
//        Olives           0,5€
//
// Основа пиццы стоит 1 €, для Calzone - надбавка 0,5 €.