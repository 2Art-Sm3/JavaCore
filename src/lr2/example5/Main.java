package lr2.example5;

public class Main {

    public static void main(String[] args) {

        // Создаем объект и инициализируем поля при помощи методов
        Rectangle rectangle1 = new Rectangle();

        rectangle1.setLength(100);
        rectangle1.setWidth(50);

        System.out.println("Длина прямоугольника = " + rectangle1.getLength());
        System.out.println("Ширина прямоугольника = " + rectangle1.getWidth());
        System.out.println("Площадь прямоугольника = " + rectangle1.getSquare());
        System.out.println("Периметр прямоугольника = " + rectangle1.getPerimeter());

        // Инициализация при помощи конструктора
        Rectangle rectangle2 = new Rectangle(20, 10);

        System.out.println("Площадь прямоугольника = " + rectangle2.getSquare());
        System.out.println("Периметр прямоугольника = " + rectangle2.getPerimeter());
    }
}
