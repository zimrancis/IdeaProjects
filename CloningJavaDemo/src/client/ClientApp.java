package client;

import model.Employee;

import java.util.ArrayList;

import model.Employee;

import java.util.Arrays;
import java.util.List;

class CallingMethod {

    public static List<Employee> getEmployee() {

        List<Employee> employee = Arrays.asList(
                new Employee(001, "Zobair", 43, "zimrancis@gmail.com", "p0o9i8u7"),
                new Employee(002, "Omar", 40, "omar@gmail.com", "q1w2e3r4")
        );

        return employee;

    }
}

public class ClientApp {
    public static void main(String[] args) {
        List<Employee> emp = CallingMethod.getEmployee();
        /*for (Employee e : emp) {
            System.out.println(e.toString());
        }*/
        emp.forEach(System.out::println);
    }
}
