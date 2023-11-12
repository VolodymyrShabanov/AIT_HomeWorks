package home_work_38_practice.models;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class Order {
    private String customerEmail;
    private String productTitle;
    private int count;

    public Order(String customerEmail, String productTitle, int count) {
        this.customerEmail = customerEmail;
        this.productTitle = productTitle;
        this.count = count;
    }


    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
