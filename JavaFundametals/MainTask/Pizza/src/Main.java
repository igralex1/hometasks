import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.util.*;

import static javafx.application.Platform.exit;

public class Main {

    public static void main(String[] args) {
       // UI newUI = new UI();

        LinkedHashMap<String, Float> test = new LinkedHashMap<>();

        ArrayList<String> choose = new ArrayList<String>();

        test.put("1",1.23f);
        test.put("2",1.2f);
        test.put("3",1.3f);

        for( Map.Entry<String,Float> entry : test.entrySet()){
            String key = entry.getKey();
            Float value = entry.getValue();
            System.out.println("ВВедите " + key + " чтобы выбрать" + "[" + key+ " : цена  " + value + "]"  );
        }

        Scanner delete = new Scanner(System.in);
        while (test.size() > 0){
            String s = delete.next().toString();
            switch (s){
                case "1":
                    if (choose.contains("1")){
                        System.out.println("Данный ингредиент уже есть");
                        break;
                    }
                    choose.add("1");
                    test.remove("1");
                    break;
                case "2":
                    if (choose.contains("2")){
                        System.out.println("Данный ингредиент уже есть");
                        break;
                    }
                    choose.add("2");
                    test.remove("2");
                    break;
                case "3":
                    if (choose.contains("3")){
                        System.out.println("Данный ингредиент уже есть");
                        break;
                    }
                    choose.add("3");
                    test.remove("3");
                    break;
            }
            if (s.equals("0")){
                break;
            }
            System.out.println("exit 0");
            for( Map.Entry<String,Float> entry : test.entrySet()){
                String key = entry.getKey();
                Float value = entry.getValue();
                System.out.println("ВВедите " + key + " чтобы выбрать" + "[" + key + " : цена  " + value + "]"  );
            }






        }


            System.out.println("Ингредиенты в моей пицце : " + choose);





    }


}



//
//        LinkedHashMap <String, Integer> myList = new LinkedHashMap<String,Integer>();
//
//
//        myList.put("first", 1);
//        myList.put("second", 2);
//        myList.put("third", 3);
//
//        myList.remove("second");
//        System.out.println(myList.get("second"));
//        System.out.println(myList.keySet().toArray()[1].toString());

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


