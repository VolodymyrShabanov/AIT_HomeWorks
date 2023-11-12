package home_work_38.models;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class Product {
    private final int id;
    private String title;
    private double price;
    private String description;

    public Product(int id, String title, double price, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "id = " + id +
                ", title = '" + title + '\'' +
                ", price = " + price +
                ", description = '" + description + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }
}
