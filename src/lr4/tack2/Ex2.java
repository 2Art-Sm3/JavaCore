package lr4.tack2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Введите значения матрицы 3х3");
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Недопустимое введенное значение");
        }

        System.out.println(Arrays.deepToString(arr));

        System.out.println("Введите номер столбца");

        try {
            int size = scanner.nextInt();
            if (size > 3 || size < 1) {
                throw new Exception();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i][size - 1]);
            }
        } catch (Exception e) {
            System.out.println("Введите номер в диапазоне от 1 до 3");
        } finally {
            scanner.close();
        }
    }
}
