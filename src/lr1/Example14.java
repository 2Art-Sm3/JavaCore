package lr1;

import java.util.Scanner;
public class Example14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int number_0 = in.nextInt();

        int number_1 = number_0 - 1;
        int number_2 = number_0 + 1;
        int number_3 = (int) Math.pow((number_0 + number_1 + number_2), 2);

        System.out.println(number_1 +" "+ number_0 +" "+ number_2 +" "+ number_3);

        in.close();


    }
}
