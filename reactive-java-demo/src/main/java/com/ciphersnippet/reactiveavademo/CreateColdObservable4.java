package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.Thread.sleep;

@SpringBootApplication
public class CreateColdObservable4 {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(CreateColdObservable4.class, args);
        createColdObservable();
    }

    private static void createColdObservable() throws InterruptedException {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);
        observable.subscribe(item -> System.out.println("Observer 1:" + item));
        pause(3000); //after 3 seconds 2nd one kicks in.
        //both of them get their own separate emission which is like playing a CD
        observable.subscribe(item -> System.out.println("Observer 2:" + item));
    }
    private static void pause(int duration) {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}