package timus;

import java.util.Scanner;

public class Task_2012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int f = in.nextInt();

        int allTasks = 12;

        int tasks = 12 - f;

        int time = tasks * 45;

        String result = time <= 240 ? "YES" : "NO";

        System.out.println(result);
    }
}
