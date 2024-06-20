package lr7.task1_2.example4;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Артем\\IdeaProjects\\JavaCore\\src\\lr7\\task1_2\\example4\\example_file.txt";
        String data;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите данные для записи: ");
        data = in.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println("Данные записаны в файл");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }

        if (new File(fileName).delete()) {
            System.out.println("Файл удален");
        } else {
            System.out.println("Не удалось удалить файл");
        }
    }
}

