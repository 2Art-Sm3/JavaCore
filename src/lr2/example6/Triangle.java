package lr2.example6;

public class Triangle implements Calculation {

    private int sideA;
    private int sideB;
    private int sideC;
    private  int height;

    public Triangle() {

    }

    public Triangle(int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
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
