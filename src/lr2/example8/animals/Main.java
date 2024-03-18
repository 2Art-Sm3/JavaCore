package lr2.example8.animals;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Animal animal_1 = new Fish();

        //Обращаемся к полям и методу класса-родителя
        dog.name = "Коксик";
        dog.age = 4;
        dog.voice();
        //Образаемся к полю и методу класса
        dog.breed = "Мопс";
        dog.bark();
        System.out.println("Имя " + dog.name + ", Порода " + dog.breed + ", Возраст " + dog.age);
        System.out.println();

        //Обращаемся к полям и методу класса-родителя
        fish.name = "Чешуя";
        fish.age = 1;
        //Образаемся к полю и методу класса
        fish.numberOfFins = 8;
        fish.swim();
        fish.voice();
        System.out.println("Имя " + fish.name + ", Кол-во плавников " + fish.numberOfFins + ", Возраст " + fish.age);

    }
}
