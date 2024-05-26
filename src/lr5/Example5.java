package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {

        List<String> listStrings = new ArrayList<>();
        listStrings.add("яблоко");
        listStrings.add("банан");
        listStrings.add("мандарин");
        listStrings.add("апельсин");
        listStrings.add("киви");
        System.out.println(listStrings);

        String substring = "ан";

        List<String> filteredString = filterBySubstring(listStrings, substring);
        System.out.println(filteredString);


    }
    public static List<String> filterBySubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
