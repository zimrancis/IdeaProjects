package com.ciphersnippet.reactiveavademo;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ObservablesExamples14 {
    public static void main(String[] args) {
        SpringApplication.run(ObservablesExamples14.class, args);

        observablesTest();
    }

    private static void observablesTest() {
        Observable<Integer> integerObservable = Observable.create(new ObservableOnSubscribe<>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                try {
                    Integer a[] = new Integer[]{1,2,3,4,5};
                    List<Integer> integers = Arrays.asList(a);
                    for (Integer integer : integers) {
                        emitter.onNext(integer);
                    }
                    emitter.onComplete();
                } catch (Exception e) {
                    emitter.onError(e);
                }
            }
        });
    }


}