package uvsoftgroup.osmdatawebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OsmdatawebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsmdatawebappApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
/*
* 30_9: Thymeleaf | Spring boot |RestTemplate |Consuming RESTful APIs/Web Services| GUI development
Technology & Tools used:
1.Eclipe IDE
2.Java 8+
3.Maven (building tool)
4.PostgreSQL with PostGIS database (back-end server)
5.RESTFul APIs/Web Services(uvsoftgrouptemplateprogramming-0.0.2.0.jar) to consume
6.Google Postman (client side testing tool)
7.Thymeleaf base web application ()osmdatawebapp-0.0.1.1)development,testing,external configuration & deployment(dev,tst,qa,ua,pro&rel env)
8.Spring Boot profile based external configuration and also deployment*/
