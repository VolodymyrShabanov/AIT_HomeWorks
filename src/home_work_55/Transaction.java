package home_work_55;

import java.time.LocalDate;

/**
 * Created by Volodymyr Sh on 26.11.2023
 * project name: AIT_HomeWorks
 */
public class Transaction {
    private int amount;
    private Operations type;
    private LocalDate timestamp;

    public Transaction(int amount, LocalDate timestamp, Operations type) {
        this.amount = amount;
        this.timestamp = timestamp;
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
                amount +
                " : " +
                type +
                " : " +
                timestamp +
                "}";
    }

    public int getAmount() {
        return amount;
    }

    public Operations getType() {
        return type;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }
}
