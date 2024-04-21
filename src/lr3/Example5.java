package lr3;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fact(5, ""));
    }

    public static int fact(int n, String tree) {
        if (n == 0) {
            System.out.println(tree + "fact(0) = 0");
            return 0;
        } else if (n == 1) {
            System.out.println(tree + "fact(1) = 1");
            return 1;
        } else {
            System.out.println(tree + "fact(" + n + ") = fact(" + (n - 2) + ") + fact(" + (n - 1) + ")");
            return fact(n - 2, tree + "\t") + fact(n - 1, tree + "\t");
        }
    }
}
