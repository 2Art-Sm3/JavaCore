package lr2.example7;

public class BankAccount implements Operations {

    private double balance;

    public BankAccount() {

    }
//    public BankAccount(double balance) {
//        this.balance = balance;
//    }

    //Методы определенные в классе
    public void deposit0(double amount) {
        balance += amount;
        System.out.println(amount + " рублей зачислено на счет");
    }

    public void withdrawal0(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Со счета снято " + amount + " рублей");
        } else {
            System.out.println("На счету недостаточно средств");
        }
    }

    public double getBalance0() {
        return balance;
    }

    //Реализия методов интерфейса
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " рублей зачислено на счет");
    }

    @Override
    public void withdrawal(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Со счета снято " + amount + " рублей");
        } else {
            System.out.println("На счету недостаточно средств");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
