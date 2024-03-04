package lr1;

import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = in.next();

        System.out.println("Введите возраст");
        int age = in.nextInt();

        System.out.printf("name: %s \nage: %d", name, age);

        in.close();
    }
}
