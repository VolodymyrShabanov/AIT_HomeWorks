package home_work_55;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Volodymyr Sh on 25.11.2023
 * project name: AIT_HomeWorks
 */

public class Task1 {
/*  Дан список сотрудников (Employee) с полями name, department, salary.
    Используя Stream API, сгруппируйте сотрудников по отделам
*/
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Egor", "IT", 5000),
                new Employee("Elena", "Marketing", 4000),
                new Employee("Igor", "Finance", 3500),
                new Employee("David", "Sales", 3000),
                new Employee("Martin", "IT", 2500),
                new Employee("Denis", "Marketing", 4500),
                new Employee("Natali", "Finance", 3800),
                new Employee("Olga", "Sales", 2850),
                new Employee("Oleg", "IT", 4250),
                new Employee("Danya", "Marketing", 5120),
                new Employee("Tanya", "Finance", 2940),
                new Employee("Pavel", "Sales", 4000)
        );

        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment()));

        System.out.println(employeesByDepartment);

    }

}
