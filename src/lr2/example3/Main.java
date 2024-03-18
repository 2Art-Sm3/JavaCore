package lr2.example3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String value = in.nextLine();

        System.out.println("Введите ключ для шифрования");
        int key = in.nextInt();
        in.nextLine(); //добавил, чтобы считать символ новой строки

        String encryptString = Encrypt.getEncryptString(value, key);
        System.out.println("Зашифрованный текст: " + encryptString);

        String str;
        boolean firstIteration = true;// создаем переменную типа boolean, чтобы при первой итерации цикла не выводился текст "Введите корректный ответ"

        do{
            //условие для вывода "Введите корректный ответ"
            if (!firstIteration){
                System.out.println("Введите корректный ответ");
            }
            System.out.println("Для выполнения обратного преобразования введите: y\nДля выхода из программы введите: n");
            str = in.nextLine();

            firstIteration = false;// изменяем значение переменной, чтобы при введении чего-то кроме y/n в след. итерации выводился текст "Введите корректный ответ"

        } while(!str.equals("y") & !str.equals("n"));

        if (str.equals("y")){
            String decryptString = Decrypt.getDecryptString(encryptString, key);
            System.out.println("Дешифрованный текст: " + decryptString);
        }
        else if (str.equals("n")){
            System.out.println("До свидания!");
        }
    }
}
