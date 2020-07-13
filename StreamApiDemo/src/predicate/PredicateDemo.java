package predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {

    public static void main(String[] args) {
        /*Predicate<Integer> prdicate = t -> t % 2 == 0;
        System.out.println(prdicate.test(4));
        System.out.println(prdicate.test(5));
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().filter(prdicate).forEach(t -> System.out.println("Print Even: " + t));*/
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Print Even: " + t));
    }
}
