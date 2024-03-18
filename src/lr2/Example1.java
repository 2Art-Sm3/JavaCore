package lr2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int size = in.nextInt();
        in.close();

        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];

        Random random = new Random();

        for (int i = 0 ; i < nums.length ; i++){
            nums[i] = random.nextInt(10);
            System.out.printf("Элемент массива [%d] = %d%n", i, nums[i]);
        }
        //делаем копию изначального массива и производим его сортировку
        int[] numsCopy = Arrays.copyOf(nums, size);
        Arrays.sort(numsCopy);

        System.out.println("Сортированный массив numsCopy = " + Arrays.toString(numsCopy) + "\nМиинимальное значение массива = " + numsCopy[0]);
        //Ищем индексы элементов с миниальными значениями
        for (int i = 0 ; i < nums.length ; i++){
            if (numsCopy[0] == nums[i])
                System.out.println("Элемент ["+i+"] исходного массива имеет минимальное значение");
        }
    }

}
