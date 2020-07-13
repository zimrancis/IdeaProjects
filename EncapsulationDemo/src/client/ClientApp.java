package client;

import dao.EmployeeDao;
import exception.InvalidIdException;
import model.Employee;

public class ClientApp {
    public static void main(String[] args) {
        EmployeeDao empDao = new EmployeeDao();
        try {
            Employee employee = empDao.getEmployeeData("EMP001");
            System.out.println(employee.getEmpId()+" "+employee.getFullName()+" "+employee.getAge());
        } catch (InvalidIdException i) {
            System.out.println(i);
        }
    }
}