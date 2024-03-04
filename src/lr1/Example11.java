package lr1;

import java.util.Scanner;

public class Example11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = in.nextLine();

        System.out.println("Введите год рождения");
        int year = in.nextInt();

        System.out.printf("%s, возраст: %d" , name, 2024-year);

        in.close();
    }
}
