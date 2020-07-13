package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Callable;

@SpringBootApplication
public class ThrowExceptionUsingCallable6 {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ThrowExceptionUsingCallable6.class, args);
        //throwException();
        throwExceptionUsingCallable6();
    }

    private static void throwException() {
        Observable observable = Observable.error(new Exception("An Exception"));
        observable.subscribe(System.out::println, error -> System.out.println("Error 1:" + error.hashCode()));
        observable.subscribe(System.out::println, error -> System.out.println("Error 2:" + error.hashCode()));
    }

    private static void throwExceptionUsingCallable6() {
        Observable observable = Observable.error(new ArithmeticException("An Exception :-("));
        observable.subscribe(System.out::println, error -> System.out.println("Error 1:" + error.hashCode()));
        observable.subscribe(System.out::println, error -> System.out.println("Error 2:" + error.hashCode()));
    }


}