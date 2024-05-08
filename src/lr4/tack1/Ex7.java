package lr4.tack1;

public class Ex7 {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1 " + e);
            try {
                throw new ArithmeticException("ошибка внутри блока catch");
            } catch (ArithmeticException e1) {
                System.out.println("4 " + e1);
            }
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }

}
