package lr4.tack1;

public class Ex12 {
    public static void m(String str, double chislo) {
        try {
            if (str == null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
        } catch (RuntimeException e) {
            System.out.println("ошибка: " + e);
        }
        try {
            if (chislo > 0.001) {
                throw new IllegalArgumentException("Неверное число");
            }
        } catch (RuntimeException e) {
            System.out.println("ошибка: " + e);
        }
    }
    public static void main(String[] args) {
        m(null, 0.01);
    }
}
