package lr1;

import java.util.Scanner;
public class Example13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        double number1 = in.nextDouble();

        System.out.println("Введите второе число");
        double number2 = in.nextDouble();

        System.out.printf("Сумма чисел = %.2f", number1 + number2);

        in.close();
    }
}
