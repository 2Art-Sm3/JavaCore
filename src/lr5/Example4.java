package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 10; i++) {
            list0.add(random.nextInt(10));
            System.out.println(list0.get(i));
        }

        List<Integer> listResult = convertToSquare(list0);
        System.out.println("Результирующий список: " + listResult);

    }

    public static List<Integer> convertToSquare(List<Integer> list) {
        return list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
}
