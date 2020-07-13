package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ReactiveJavaApp3 {
    public static void main(String[] args) {
        SpringApplication.run(ReactiveJavaApp3.class, args);
        Observable observable = Observable.just(1, 2, 3, 4, 5);
        Observer<Integer> observer = new Observer<>() {

            @Override
            public void onError(Throwable e) {
                System.out.println(e.getLocalizedMessage());

            }

            @Override
            public void onComplete() {
                System.out.println("Completed");
            }

            @Override
            public void onSubscribe(@NonNull Disposable disposable) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.println(integer);
            }
        };
        observable.subscribe(observer);
    }

}