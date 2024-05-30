package lr5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();

        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0 ; i < size ; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println("Значения массива: " + Arrays.toString(arr));

        int[] arrResult = Arrays.stream(arr)
                .filter(p -> p % 2 == 0)
                .toArray();

        System.out.println("Значения отфильтрованного массива: " + Arrays.toString(arrResult));
    }
}
