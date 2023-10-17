package home_work_29.PaymentSystem;

public class MainAccount {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount("Stas", "EUR", "DE");
        BankAccount ba1 = new BankAccount("Yuliya", "EUR", "DE");

        ba.setAmount(349, "USD");
        ba1.setAmount(50000, "EUR");

        System.out.println(ba.toString());
        System.out.println(ba1.toString());

        ba.transferMoney();
        ba1.transferMoney();
        ba1.checkBalance();



    }
}
