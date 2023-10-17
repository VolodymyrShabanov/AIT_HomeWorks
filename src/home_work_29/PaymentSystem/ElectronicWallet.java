package home_work_29.PaymentSystem;

import java.util.Scanner;

public class ElectronicWallet implements PaymentSystem{

    private final int id;
    private static int counter;
    private int amount;
    private String mail;
    private String currency;
    private String account;
    static final String INDEX_WALLET = "EW";
    Scanner scanner = new Scanner(System.in);

    public ElectronicWallet(String mail, String currency) {
        this.mail = mail;
        this.currency = currency;
        this.id  = counter++;
        this.account = INDEX_WALLET + String.format("%05d", id) + currency;
    }

    @Override
    public void transferMoney() {
        System.out.println("Введите номер счета получателя (пример - DE2600991EUR):");
        String accountRecipient = scanner.nextLine();
        System.out.println("Введите валюту перевода:");
        String transferCurrency = scanner.nextLine();

        if (!checkCurrency(transferCurrency)) {
            return;
        }

        System.out.println("Введите суму перевода:");
        int transferAmount = scanner.nextInt();
        scanner.nextLine(); // Добавляем эту строку, чтобы съесть пустую строку в буфере ввода


        if (transferAmount <= amount) {
            this.amount -= transferAmount;
            System.out.println("Со счета: " + this.account + " на счет: " + accountRecipient + "  переведена сумма "
                    + transferAmount + " " + currency + ";");
            checkBalance();
        } else {
            System.out.println("Запрашиваемая сумма превышает остаток на счету.");
        }
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Введите суму:");
        int cashAmount = scanner.nextInt();
        scanner.nextLine(); // Добавляем эту строку, чтобы съесть пустую строку в буфере ввода

        if (cashAmount <= amount) {
            this.amount -= cashAmount;
            System.out.println("Со счета: " + this.account + " выдана сума " + cashAmount + " " + currency + ";");
            checkBalance();
        } else {
            System.out.println("Запрашиваемая сумма превышает остаток на счету.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Остаток на счету составляет: " + amount + " " + currency + ";");
    }

    @Override
    public String toString() {
        return "ElectronicWallet{" +
                "amount=" + amount +
                ", mail='" + mail + '\'' +
                ", currency='" + currency + '\'' +
                ", account='" + account + '\'' +
                '}';
    }

    public boolean checkCurrency (String currency) {
        if (currency.equalsIgnoreCase(this.currency)) {
            return true;
        }
        System.out.println("Введенная валюта не соответствует валюте счета!");
        return false;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (!checkCurrency(currency)) {
            return;
        }

        if (amount > 0) {
            this.amount = amount;
            System.out.println("Счет пополнен на: " + amount + " " + currency + ";");
            System.out.println("Остаток на счету составляет: " + amount + " " + currency + ";");
        } else {
            System.out.println("Сумма пополнения не может быть меньше 0.");
        }
    }

    public String getMail() {
        return mail;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAccount() {
        return account;
    }
}
