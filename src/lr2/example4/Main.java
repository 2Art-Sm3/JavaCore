package lr2.example4;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Артем", 24, "мужской");

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());

        Person person2 = new Person();

        person2.setName("Семен");
        person2.setAge(16);
        person2.setGender("Мужской");

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getGender());
    }
}
