package home_work_29.PaymentSystem;

import java.util.Scanner;

public class BankAccount implements PaymentSystem{

    private final int id;
    private static int counter;
    private int amount;
    private String name;
    private String currency;
    private String country;
    private String account;
    static final String BALANCE_ACCOUNT = "2600";
    Scanner scanner = new Scanner(System.in);


    // суммы счета нет так как есть вероятность создать счет с отрицательным остатком
    // проверку пополнения суммы перенес отдельно в set
    public BankAccount(String name, String currency, String country) {
        this.name = name;
        this.currency = currency;
        this.country = country;
        this.id = counter++;
        this.account = country + BALANCE_ACCOUNT + String.format("%03d", id) + currency;
    }

    // реализовал через терминал - по части что бы вспомнить как им пользоваться.
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
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }


    public boolean checkCurrency (String currency) {
        if (currency.equalsIgnoreCase(this.currency)) {
            return true;
        }
        System.out.println("Введенная валюта не соответствует валюте счета!");
        return false;
    }

    public String getAccount() {
        return account;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount, String currency) {

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

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCountry() {
        return country;
    }
}

