package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list);

        List<Integer> listResult = filterByNums(list, 5);
        System.out.println(listResult);
    }
    public static List<Integer> filterByNums(List<Integer> list, int value) {
        return list.stream()
                .filter(x -> x > value)
                .collect(Collectors.toList());
    }
}
