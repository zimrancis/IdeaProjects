package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.Thread.sleep;

@SpringBootApplication
public class CreateHotAndConnectableObservable5 {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(CreateHotAndConnectableObservable5.class, args);
        createHotAndConnectableObservable();
    }

    private static void createHotAndConnectableObservable() {
        ConnectableObservable<Integer> observable = Observable.just(1,2,3,4,5).publish();
        observable.subscribe(item -> System.out.println("Observer 1:" + item));
        //connectableObservable doesn't start its emission right after you
        // subscribe on it, it started its emission the moment we call .connect() !
        //whoever subscribes to this observable later surely misses some emission
        //so we can call it hot observable
        observable.connect();
        pause(3000);
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