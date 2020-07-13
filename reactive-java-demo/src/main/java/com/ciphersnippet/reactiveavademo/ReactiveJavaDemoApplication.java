/*
package com.ciphersnippet.reactiveavademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rx.Observable;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ReactiveJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveJavaApplication.class, args);

		Observable<Users> observable = new ReactiveJavaApplication()
				.getData(getUser());
	}

	private Observable<Users> getData(final List<Users> usersList) {

		return Observable.fromCallable();
	}

	private static List<Users> getUser() {
		List<Users> userList = new ArrayList<>();
		userList.add(new Users("Bean", 500000));
		userList.add(new Users("George", 450000));
		return userList;
	}

}
*/
