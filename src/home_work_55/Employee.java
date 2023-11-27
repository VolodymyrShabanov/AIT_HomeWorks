package home_work_55;

/**
 * Created by Volodymyr Sh on 25.11.2023
 * project name: AIT_HomeWorks
 */
public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                name +
                " : " +
                department +
                " : " +
                salary +
                "}";
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}
