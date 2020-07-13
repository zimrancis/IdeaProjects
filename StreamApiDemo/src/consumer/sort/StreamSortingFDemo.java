package consumer.sort;

import consumer.sort.database.Database;
import model.Employee;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamSortingFDemo {

    public static void main(String[] args) {

        /*List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);
        Collections.sort(list);//ASCENDING
        System.out.println(list);
        Collections.reverse(list);//Descending
        System.out.println(list);
        list.stream().sorted().forEach(s -> System.out.println(s));
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));*/

        List<Employee> employees = Database.getEmployees();
        Collections.sort(employees, new MyComparator());
        System.out.println(employees);


    }
}

class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return (int) (o2.getSalary() - o1.getSalary()); //ascending
    }
}
