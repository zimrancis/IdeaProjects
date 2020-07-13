package com.ciphersnippet.reactiveavademo;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.single.SingleJust;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingleMaybeCompletable12 {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SingleMaybeCompletable12.class, args);

        //createSingle();
        //createMaybe();
        createCompletable();
    }

    private static void createSingle() {
        Single.just("Hello World!").subscribe(System.out::println);
    }

    private static void createMaybe() {
        Maybe.empty().subscribe(new MaybeObserver<Object>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                
            }

            @Override
            public void onSuccess(Object o) {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("Done");
            }
        });

    }

    private static void createCompletable() {
        Completable.fromSingle(Single.just("Hello World")).subscribe(() -> System.out.println("Done"));
    }

}