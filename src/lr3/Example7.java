package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example7 {

    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static void array(int[] arr, int i) {
        if (i < arr.length) {
            arr[i] = random.nextInt(10);
            array(arr, i + 1);
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int[] arr = new int[size];
        array(arr, 0);
    }
}