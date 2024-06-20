package lr7.task3.example8;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("src/lr7/task3/example8/input.txt"));

        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }
        reader.close();
        System.out.println("Количество строк в файле = " + lineCount);
    }
}
