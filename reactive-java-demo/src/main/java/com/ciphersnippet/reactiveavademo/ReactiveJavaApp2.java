package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ReactiveJavaApp2 {
    public static void main(String[] args) {
        SpringApplication.run(ReactiveJavaApp2.class, args);

        createObservableWithJust();
        createObservableFrom();
        createObservableUsingCreate();

    }

    private static void createObservableWithJust() {
        //List list = Arrays.asList(1,2,3,4,5);
        Observable observable = Observable.just(/*list*/1,2,3,4,5);
        //observable.subscribe(item -> System.out.println(item)); **OR**
        observable.subscribe(System.out::println);
    }

    private static void createObservableFrom() {
        List list = Arrays.asList(1,2,3,4,5);
        Observable observable = Observable.fromArray(list);
        //observable.subscribe(item -> System.out.println(item)); **OR**
        observable.subscribe(System.out::println);
    }

    private static void createObservableUsingCreate() {
        Observable<Integer> observable = Observable.create(emitter -> {
            emitter.onNext(1);
            emitter.onNext(2);
            emitter.onNext(3);
            emitter.onNext(null);
            emitter.onNext(5);
            emitter.onNext(6);
            emitter.onComplete();
        });
        observable.subscribe(item -> System.out.println(item),
                error -> System.out.println("There was an error: "+ error.getLocalizedMessage()),
                () -> System.out.println("COMPLETED"));
    }

}