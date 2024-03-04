package lr1;

import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения");
        int year_of_birth = in.nextInt();

        System.out.printf("Вам %d лет", 2024-year_of_birth);

        in.close();
    }
}
