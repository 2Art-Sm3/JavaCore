package lr7.task8;

import java.io.*;

public class UserTest {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Test");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/lr7/task8/user.dat"))) {
            oos.writeObject(user);
        } catch (FileNotFoundException e) {
            System.out.println("ошибка1");;
        } catch (IOException e) {
            System.out.println("ошибка2");;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/lr7/task8/user.dat"))){
            User user2 = (User) ois.readObject();
            System.out.println(user2);
        } catch (FileNotFoundException e) {
            System.out.println("a");
        } catch (IOException e) {
            System.out.println("аг");
        } catch (ClassNotFoundException e) {
            System.out.println("erc");
        }
    }
}
