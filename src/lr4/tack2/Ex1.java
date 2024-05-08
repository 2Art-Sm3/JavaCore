package lr4.tack2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Введите 5 положительных целых чисел");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        try {
            for (int i = 0 ; i < arr.length ; i++ ) {
                arr[i] = scanner.nextInt();
                if (arr[i] < 0) {
                    throw new Exception();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: " + e + ". Введите корректные значения");
        } catch (Exception e) {
            System.out.println("Ошибка: " + ". Введите положительные числа");
        } finally {
            scanner.close();
        }
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
        float value = (float) (sum / 5.0);
        System.out.println(value);
    }
}
