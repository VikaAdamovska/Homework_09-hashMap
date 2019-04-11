package edu.hillel.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
          /*2)- создать класс Test {
                int intField;
                String stringField;
            }
            - переопределить методы equals и hashCode
            - создать любое количество объектов класса тест
            - добавить их в HashMap в качестве ключей и значений
            - вывести на консоль значение всех ключей и значений с помощью метода entrySet()
            - вывести на консоль значение всех ключей и значений с помощью метода keySet()*/

        Map<Integer, String> mapPhone = new HashMap<>();

        Phone apple = new Phone(556, "Apple");
        Phone samsung = new Phone(997, "Samsung");
        Phone xiaomi = new Phone(884, "Xiaomi");
        Phone sony = new Phone(891, "Sony");
        Phone nokia = new Phone(773, "Nokia");

        mapPhone.put(apple.getId(), apple.getTrademark());
        mapPhone.put(samsung.getId(), samsung.getTrademark());
        mapPhone.put(xiaomi.getId(), xiaomi.getTrademark());
        mapPhone.put(sony.getId(), sony.getTrademark());
        mapPhone.put(nokia.getId(), nokia.getTrademark());

        MapMethods.showMapKeySet(mapPhone);
        MapMethods.showMapEntrySet(mapPhone);
    }
}