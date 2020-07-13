package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObservableDefer8 {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ObservableDefer8.class, args);
        //observabableRange2();
        observabableDefer();
    }

    private static void observabableRange2() {
        int start = 5, count = 2;
        Observable observable = Observable.range(start, count);
        observable.subscribe(item -> System.out.println("Observer 1:" + item));
        count = 3;
        observable.subscribe(item -> System.out.println("Observer 2:" + item));
    }

    private static void observabableDefer() {
        int start = 5, count = 2;
        int finalCount = count;
        Observable<Integer> observable = Observable.defer(() -> Observable.range(start, finalCount));
        observable.subscribe(item -> System.out.println("Observer 1:" + item));
        count = 3;
        observable.subscribe(item -> System.out.println("Observer 2:" + item));
    }


    private static void pause(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }


}