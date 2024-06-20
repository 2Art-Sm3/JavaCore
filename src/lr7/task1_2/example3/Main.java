package lr7.task1_2.example3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Артем\\IdeaProjects\\JavaCore\\src\\lr7\\task1_2\\example3\\example_file.txt";
        String data;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите данные для записи: ");
        data = in.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
            System.out.println("Данные записаны");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }

        try (FileReader reader = new FileReader(fileName)) {
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
