package home_work_55;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Volodymyr Sh on 26.11.2023
 * project name: AIT_HomeWorks
 */
public class Task3 {
    /*  Дан список Employee.
        Вычислите среднюю зарплату сотрудников в каждом отделе
        и найдите отдел с максимальной средней зарплатой.
    */

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Egor", "IT", 6000),
                new Employee("Elena", "Marketing", 4000),
                new Employee("Igor", "Finance", 3500),
                new Employee("David", "Sales", 3000),
                new Employee("Martin", "IT", 2650),
                new Employee("Denis", "Marketing", 4500),
                new Employee("Natali", "Finance", 3800),
                new Employee("Olga", "Sales", 2850),
                new Employee("Oleg", "IT", 4250),
                new Employee("Danya", "Marketing", 3120),
                new Employee("Tanya", "Finance", 2940),
                new Employee("Pavel", "Sales", 4000)
        );

        Map<String, Double> averageSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getSalary)));

        System.out.println("averageSalaryByDepartment: " + averageSalaryByDepartment);

        //Option 1
        Double maxAverageSalary = 0.0;
        String departmentWithMaxAverageSalary = "";
        for (Map.Entry<String, Double> entry : averageSalaryByDepartment.entrySet()) {
            if (entry.getValue() > maxAverageSalary) {
                maxAverageSalary = entry.getValue();
                departmentWithMaxAverageSalary = entry.getKey();
            }
        }
        System.out.println("departmentWithMaxAverageSalary: " + departmentWithMaxAverageSalary + "=" + maxAverageSalary);

        //Option 2 (
        Map.Entry<String, Double> departmentWithMaxAverageSalary2 = averageSalaryByDepartment.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .orElse(null);

        System.out.println(departmentWithMaxAverageSalary2);

        // Option 3
        Map.Entry<String, Double> doubleEntry = averageSalaryByDepartment.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get();

    }

}
