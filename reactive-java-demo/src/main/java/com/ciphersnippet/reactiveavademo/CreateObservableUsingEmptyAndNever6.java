package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreateObservableUsingEmptyAndNever6 {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(CreateObservableUsingEmptyAndNever6.class, args);
        createObservableUsingEmpty();
        createObservableUsingNever();
    }

    private static void createObservableUsingEmpty() {
        Observable observable = Observable.empty();
        observable.subscribe(System.out::println, System.out::println, () -> System.out.println("Completed"));
    }

    private static void createObservableUsingNever() {
        Observable observable = Observable.never();
        observable.subscribe(System.out::println, error -> System.out.println("Error 1:" + error.hashCode()));
        pause(3000);
    }

    private static void pause(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }


}