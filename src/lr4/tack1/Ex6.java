package lr4.tack1;

public class Ex6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2 " + e);
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");

    }

}

