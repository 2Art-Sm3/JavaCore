package timus;

import java.util.Scanner;

public class Task_1264 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int numberOfM = m + 1;

        int result = numberOfM * n;

        System.out.println(result);
    }
}
