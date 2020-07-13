package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ObservableInterval10 {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ObservableInterval10.class, args);

        Observable observable = Observable.interval(1, TimeUnit.SECONDS/*, Schedulers.io()*/);
        observable.subscribe(item -> System.out.println("Observer 1: "+item));
        Thread.sleep(2000);
        observable.subscribe(item -> System.out.println("Observer 2: "+item));
        Thread.sleep(3000);
    }

}
