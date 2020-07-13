package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObservableRange7 {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ObservableRange7.class, args);
        observabableRange();
    }

    private static void observabableRange() {
        int start = 5, count = 2;
        Observable observable = Observable.range(start, count);
        observable.subscribe(System.out::println);
    }


    private static void pause(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }


}