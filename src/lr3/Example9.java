package lr3;

import java.util.HashMap;
import java.util.Map;

public class Example9 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");

        // Находим строки с ключами больше 5 и выводим их через запятую
        StringBuilder keysGreaterThanFive = new StringBuilder();
        for (int key : map.keySet()) {
            if (key > 5) {
                if (keysGreaterThanFive.length() > 0) {
                    keysGreaterThanFive.append(", ");
                }
                keysGreaterThanFive.append(map.get(key));
            }
        }
        System.out.println("Строки с ключами больше 5: " + keysGreaterThanFive.toString());
    }
}
