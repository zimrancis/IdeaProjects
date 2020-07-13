package com.ciphersnippet.client;

import com.ciphersnippet.entities.Employee;
import com.ciphersnippet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class FetchDataClientTest {

    public static void main(String[] args) {
        Employee employee = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            employee = session.get(Employee.class, 1);
            System.out.println(employee);
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        if(employee != null){
            employee.getAddressList().forEach(System.out::println);
        }
    }
}