package lr2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк массива");
        int m = in.nextInt();

        System.out.println("Введите количество столбцов массива");
        int n = in.nextInt();

        in.close();

        int[][] twoD = new int[m][n];

        Random random = new Random();

        for (int i = 0 ; i < m ; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    twoD[i][j] = random.nextInt(10);
                    System.out.println(Arrays.deepToString(twoD));
                }
            }
            else {
                for (int j = n - 1 ; j >= 0 ; j--) {
                    twoD[i][j] = random.nextInt(10);
                    System.out.println(Arrays.deepToString(twoD));
                }
            }
        }
       System.out.println("\nМассив int[][] twoD = " + Arrays.deepToString(twoD));

    }
}

