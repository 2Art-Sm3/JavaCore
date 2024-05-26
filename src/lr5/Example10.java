package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);

        List<Integer> listResult = filterByNum(list, 7);
        System.out.println(listResult);
    }
    public static List<Integer> filterByNum(List<Integer> list, int value) {
        return list.stream()
                .filter(x -> x < value)
                .collect(Collectors.toList());
    }
}
