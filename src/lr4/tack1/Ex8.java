package lr4.tack1;

public class Ex8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Ошбика поймана");
        } finally {
            System.out.println("1");
        }
        return 5;
    }

    public static void main(String[] args) {
        System.out.println(m());
    }

}

