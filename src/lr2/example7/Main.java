package lr2.example7;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount_1 = new BankAccount();
        BankAccount bankAccount_2 = new BankAccount();

        bankAccount_1.deposit0(100000);
        bankAccount_1.withdrawal0(50000);
        System.out.println("На счету " + bankAccount_1.getBalance0() + " рублей");

        bankAccount_2.deposit(10000);
        bankAccount_2.withdrawal(30000);
        System.out.println("На счету " + bankAccount_2.getBalance0() + " рублей");
    }
}
