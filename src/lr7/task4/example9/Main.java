package lr7.task4.example9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("src/lr7/task4/example9/input.txt");
        FileWriter fileWriter = new FileWriter("src/lr7/task4/example9/output.txt");

        int c;
        while ((c = fileReader.read()) != -1) {
            fileWriter.write(c);
        }
        fileReader.close();
        fileWriter.close();
        System.out.println("Файл скопирован успешно");
    }
}
