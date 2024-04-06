package lr3;

import java.util.Scanner;

public class Example6 {
    public static void convert(int n) {
        if (n > 1) {
            convert(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целочисленное значение");
        convert(in.nextInt());
        in.close();
    }
}
