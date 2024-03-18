package lr2.example6;

public class Square implements Calculation {

    private int side;

    public Square() {

    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
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
