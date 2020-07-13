package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Consumer;

@SpringBootApplication
public class ReactiveJavaApp {
    public static void main(String[] args) {
        SpringApplication.run(ReactiveJavaApp.class, args);

        Observable.just(1,2,3,4,5)
                //.subscribe(System.out::println);
                /*.subscribe(new Consumer<Integer>() {

                    @Override
                    public void accept(Integer integer) throws Exception {
                        System.out.println(integer);
                    }*/
                //.subscribe(integer -> System.out.println(integer);
                  .subscribe(System.out::println);
    }

}