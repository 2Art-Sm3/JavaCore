package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list);
        int value = 3;

        List<Integer> listResult = filterByValue(list, value);
        System.out.println(listResult);
    }

    public static List<Integer> filterByValue(List<Integer> list, int value) {
        return list.stream()
                .filter(x -> x % value == 0)
                .collect(Collectors.toList());
    }
}
