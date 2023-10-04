package home_work_20;

public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void info() {
        System.out.printf("My name is %s. I am %d years old. I have a salary of %s euros.", name, age, salary);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName (String newName) {
        this.name = newName;
    }

    public void setAge (int newAge) {
        this.age = newAge;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }



}
