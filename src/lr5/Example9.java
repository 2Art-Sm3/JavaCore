package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {

        String str = "9. Напишите функцию, которая принимает на вход список строк и возвращает новый " +
                "список, содержащий только те строки, которые содержат только буквы (без цифр и символов).";

        List<String> list = Arrays.asList(str.split(" "));
        System.out.println(list);

        List<String> listResult = filterByString(list);
        System.out.println(listResult);

    }
    public static List<String> filterByString(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[а-яА-Я]+"))
                .collect(Collectors.toList());
    }
}
