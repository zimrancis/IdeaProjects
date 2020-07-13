package consumer.sort.database;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(176, "Jewel", "Business", 16500));
        employees.add(new Employee(388, "Shilpi", "Law", 17500));
        employees.add(new Employee(4700, "Mamun", "Science", 18500));
        employees.add(new Employee(176, "Pappu", "Bar @Law", 19500));
        employees.add(new Employee(176, "Sharmin", "Architect", 20500));
        return employees;
    }
}
