package lr7.task1_2.example7;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();

        Person person = new Person(name, age);

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("src/lr7/task1_2/example7/person.json");
            ObjectOutputStream out =
                    new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
