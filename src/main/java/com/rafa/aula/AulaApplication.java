package com.rafa.aula;

import com.rafa.aula.entities.Order;
import com.rafa.aula.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {
	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.00);
		Order order2 = new Order(2282, 800.00);
		Order order3 = new Order(1309, 95.90);
		System.out.println(orderService.total(order1));
		System.out.println(orderService.total(order2));
		System.out.println(orderService.total(order3));
	}
}
