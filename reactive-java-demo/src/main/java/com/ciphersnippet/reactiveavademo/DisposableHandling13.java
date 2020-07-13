package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.ResourceObserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DisposableHandling13 {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DisposableHandling13.class, args);
        //handleDisposable();
        //handleDisposableInObserver();
        handleDisposableOutsideObserver();

    }


    private static void handleDisposable() throws InterruptedException {
        Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS);
        Disposable disposable = observable.subscribe(System.out::println);
        Thread.sleep(4000);
        disposable.dispose();
        Thread.sleep(3000);
        System.out.println("isDisposed");
    }

    private static void handleDisposableInObserver() {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5, 6, 7);
        Observer<Integer> observer = new Observer<Integer>() {
            Disposable disposable;

            @Override
            public void onSubscribe(@NonNull Disposable disposable) {
                this.disposable = disposable;
            }

            @Override
            public void onNext(@NonNull Integer integer) {
                if (integer == 3) {
                    disposable.dispose();
                }
                System.out.println(integer);
            }

            @Override
            public void onError(@NonNull Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        };
        observable.subscribe(observer);
    }


    private static void handleDisposableOutsideObserver() {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5, 6, 7);
        ResourceObserver<Integer> observer = new ResourceObserver<Integer>() {
            Disposable disposable;
            @Override
            public void onNext(@NonNull Integer integer) {
                if (integer == 3) {
                    disposable.dispose();
                }
                System.out.println(integer);
            }

            @Override
            public void onError(@NonNull Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        };
        Disposable d = observable.subscribeWith(observer);
    }

}