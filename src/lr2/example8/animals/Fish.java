package lr2.example8.animals;

public class Fish extends Animal {

    public int numberOfFins;

    public void swim() {
        System.out.println("Я плаваю");
    }

    @Override
    public void voice() {
        System.out.println("Молчит");
    }
}
