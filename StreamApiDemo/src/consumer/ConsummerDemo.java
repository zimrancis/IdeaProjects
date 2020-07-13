package consumer;

        import java.util.Arrays;
        import java.util.List;

public class ConsummerDemo /*implements Consumer<Integer>*/ {

    /*@Override
    public void accept(Integer i) {
        System.out.println("Printing: " + i);
    }

    public static void main(String[] args) {
        Consumer<Integer> consumer = new ConsummerDemo();
        consumer.accept(10);
    }*/
    //OR
    public static void main(String[] args) {
        // OR
        /*Consumer<Integer> consumer;
        consumer = (Integer t) -> {
            System.out.println("Printing: " + t);
        };
        consumer.accept(10);
    }*/
        //OR
        /*Consumer<Integer> consumer2 = t2 -> System.out.println("Printing: " + t2);
        consumer2.accept(10);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //list.stream().forEach(consumer2);
            //OR
        list.forEach(consumer2);*/
        //OR
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //list.stream().forEach(t -> System.out.println("Printing: " + t));
        //OR
        //list.stream().forEach(System.out::println);
        //OR
        list.forEach(t -> System.out.println("Printing: " + t));
    }
}