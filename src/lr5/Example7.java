package lr5;


import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {

        String str = "Напишите функцию, которая принимает на вход список строк и возвращает новый список," +
                " содержащий только те строки, которые имеют длину больше заданного значения.";
        System.out.println(str + "\n");

        List<String> listStrings = List.of(str.split(" "));
        System.out.println(listStrings + "\n");

        List<String> listResult = filterByString(listStrings, 6);
        System.out.println(listResult);

    }

    public static List<String> filterByString(List<String> list, int value) {
        return list.stream()
                .filter(s -> s.length() > value)
                .collect(Collectors.toList());
    }
}
