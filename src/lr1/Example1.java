package lr1;

public class Example1 {

    public static void main(String[] args) {

        System.out.println("Привет мир!");

        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        System.out.println(one == two);
        System.out.println(one.equals(two));
        String three = one;
        System.out.println(three);
        System.out.println(three == two);
        System.out.println(three.equals(two));
        one = null;
        System.out.println(three);
    }

}
