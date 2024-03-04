package lr1;

import java.util.Scanner;
public class Example15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//не обращайте внимание на типы данных, я специально их выбрал, чтобы поиграть с кастованием

        System.out.println("Введите первое число");
        float num_1 = in.nextFloat();

        System.out.println("Введите второе число");
        float num_2 = in.nextFloat();

        int num_3 = (int) (num_1 + num_2);
        int num_4 = (int) (num_1 - num_2);

        System.out.printf("Сумма чисел = %d%nРазность чисел = %d", num_3, num_4);

        in.close();
    }
}
