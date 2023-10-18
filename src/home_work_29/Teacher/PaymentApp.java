package home_work_29.Teacher;

public class PaymentApp {
    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount(15000, "FG-Bank", "DE232322232322323");
        ElectronicWallet wallet = new ElectronicWallet(5, "E-Pay");

        System.out.println(bankAccount);
        System.out.println(wallet);

        bankAccount.withdrawMoney(100);
        System.out.println("Баланс после вывода средств: " + bankAccount.getBalance());

        wallet.transferMoney(1, bankAccount);
        System.out.println("Кошелек: " + wallet.getBalance());
        System.out.println("Банк: " + bankAccount.getBalance());

        System.out.println("==============");
        bankAccount.transferMoney(15000, wallet);
        System.out.println("Кошелек: " + wallet.getBalance());
        System.out.println("Банк: " + bankAccount.getBalance());

        System.out.println(wallet.transferMoney(10, bankAccount));
        System.out.println("Кошелек: " + wallet.getBalance());
        System.out.println("Банк: " + bankAccount.getBalance());

    }
}
