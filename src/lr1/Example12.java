package lr1;

import java.util.Scanner;
public class Example12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ваш возраст");
        int age = in.nextInt();

        System.out.printf("Ваш год рождения: %d", 2024-age);

        in.close();
    }
}
