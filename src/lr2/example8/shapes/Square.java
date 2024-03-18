package lr2.example8.shapes;

public class Square extends Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
