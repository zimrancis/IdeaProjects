package dao;

import exception.InvalidIdException;
import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private static List<Employee> empList = null;

    static {
        empList = new ArrayList<Employee>();
        Employee e1 = new Employee();
        e1.setEmpId("EMP001");
        e1.setFirstName("Imtiaz");
        e1.setLastName("Jewel");
        e1.setAge(50);
        Employee e2 = new Employee();
        e2.setEmpId("EMP002");
        e2.setFirstName("Zobair");
        e2.setLastName("Imran");
        e2.setAge(43);
        Employee e3 = new Employee();
        e3.setEmpId("EMP003");
        e3.setFirstName("Omar");
        e3.setLastName("Sufian");
        e3.setAge(40);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
    }


    public Employee getEmployeeData(String empId) throws InvalidIdException {
        System.out.println("Going to DB to get employee Data");

        Employee employee = getEmployeeById(empId);
        String fullName = getFullName(employee.getFirstName(), employee.getLastName());
        employee.setFullName(fullName);
        return employee;
    }

    private String getFullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    private Employee getEmployeeById(String empId) throws InvalidIdException {
        Employee employee = new Employee();
        String temp = null;
        for (Employee emp : empList) {
            temp = emp.getEmpId();
            if (emp.getEmpId().equalsIgnoreCase(empId)) {
                return emp;
            }
        }
        employee.setEmpId(temp);
        if (!(employee.equals(empId))) {
            throw new InvalidIdException("): No Such ID is found in database");
        }
        return null;

    }

}
