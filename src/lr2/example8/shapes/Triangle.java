package lr2.example8.shapes;

public class Triangle extends Shape {

    private int sideA;
    private int sideB;
    private int sideC;
    private  int height;

    public Triangle(int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * sideA * height;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
