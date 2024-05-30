package lr5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        Random random = new Random();

        for(int i = 0; i < size; i++) {
            arr1[i] = random.nextInt(15);
            arr2[i] = random.nextInt(15);
        }
        System.out.println("Первый массив: " + Arrays.toString(arr1));
        System.out.println("Второй массив: " + Arrays.toString(arr2));

        int[] arrResult = Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2)
                .anyMatch(y -> y == x))
                .toArray();
        System.out.println("Отфильтрованный массив: " + Arrays.toString(arrResult));
    }
}
