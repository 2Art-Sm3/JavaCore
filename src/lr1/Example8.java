package lr1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели");
        String day = in.next();

        System.out.println("Введите название месяца");
        String month = in.next();

        System.out.println("Введите номер дня в месяце");
        int num = in.nextInt();

        System.out.printf("День недели: %s%nЧисло: %d%nМесяц: %s", day, num, month);

        in.close();


    }
}
