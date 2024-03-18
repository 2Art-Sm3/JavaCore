package lr2.example8.shapes;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Square square = new Square(5);
        Triangle triangle = new Triangle(10, 12, 14, 8);

        System.out.println("Периметр круга = " + circle.perimeter() + " Площадь круга = " + circle.area());
        System.out.println("Периметр квадрата = " + square.perimeter() + " Площадь квадрата = " + square.area());
        System.out.println("Периметр треугольника = " + triangle.perimeter() + " Площадь треугольника = " + triangle.area());
    }
}
