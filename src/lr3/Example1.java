package lr3;

public class Example1 {

    public static void m(int x) {
        System.out.println("x = " + x);
        if ((2 * x + 1) < 20 & (2 * x + 1) >= 0) {
            m(2 * x + 1);
        }
    }

    public static void main(String[] args) {
        m(0);
    }
}


