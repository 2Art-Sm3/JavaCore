package lr4.tack2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte[] arr = new byte[10];
        int step = 0;
        int sum = 0;

        System.out.println("Введите 10 значений тиап byte");

        do {
            try {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = scanner.nextByte();
                    sum += arr[i];
                    step = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введите корректное значение");
                scanner.nextLine();
                step++;
                sum = 0;
            }
        } while (step > 0);

        System.out.println(Arrays.toString(arr));
        System.out.println("сумма элементов равна " + sum);
    }
}
