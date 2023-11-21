package home_work_51.teacher;

/**
 * Created by Volodymyr Sh on 20.11.2023
 * project name: AIT_HomeWorks
 */
public class DataTransfer {
    private String userName;
    private int amount;

    public DataTransfer(String record) {
        String [] data = record.split(":");
        this.userName = data[0];
        this.amount = Integer.parseInt(data[1]);
    }

    public String getUserName() {
        return userName;
    }

    public int getAmount() {
        return amount;
    }
}
