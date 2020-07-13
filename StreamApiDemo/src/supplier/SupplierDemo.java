package supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo /*implements Supplier<String>*/{

    /*@Override
    public String get() {
        return "Hi! This is Zobair.";
    }*/

    public static void main(String[] args) {
        //Supplier<String> supplier = new SupplierDemo();

        //Supplier<String> supplier = () -> {return "Hi! This is Zobair.";};
        // or
        //Supplier<String> supplier = () -> "Hi! This is Zobair.";
        //System.out.println(supplier.get());
        List<String> list = Arrays.asList(/*"a", "b"*/);
        //System.out.println(list.stream().findAny().orElseGet(supplier));
        // or
        System.out.println(list.stream().findAny().orElseGet(() -> "Hello! Java Stream API."));

    }
}
