package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


@SpringBootApplication
public class ObservableFromCallable9 {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ObservableFromCallable9.class, args);
        Observable observable = Observable.fromCallable(() -> {
            System.out.println("Calling Method");
            return getNumber();
        });
        observable.subscribe(System.out::println,
                error -> {
                    if (error.toString() == "java.lang.NullPointerException") {
                        String s = "'): A TreeSet cannot have Null value !!!'";
                        System.out.println("An Exception Occurred " + s);
                    } else System.out.println("An Exception Occurred " + error);

                });
    }

    private static List getNumber() {
        //private static Set getNumber() {
        System.out.println("Generating values");
        List<Integer> list = Arrays.asList(1, 2, null, 4, 5);
        Set<List> set = new TreeSet(list); /* *** Interesting Part *** */
        //return set;
        return list;
    }

}
