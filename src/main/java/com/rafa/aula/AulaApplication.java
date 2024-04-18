package com.rafa.aula;

import com.rafa.aula.entities.Order;
import com.rafa.aula.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {
	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		boolean executar = true;
		while(executar){
			System.out.println("Calcular valor do produto com desconto - 1");
			System.out.println("Encerrar programa - 2");
			System.out.print("Digite uma opção: ");
			int i = sc.nextInt();
			System.out.println("");
			switch (i){
				case 1:
					System.out.print("Codigo do cliente: ");
					int codigo = sc.nextInt();
					System.out.print("Valor do produto: ");
					double valor = sc.nextDouble();
					System.out.print("Percentual de desconto: ");
					double desconto = sc.nextDouble();
					Order order = new Order(codigo, valor, desconto);
					System.out.println("");
					System.out.println("Valor final: "+orderService.total(order));
					System.out.println("");
					break;
				case 2:
					System.out.println("Encerrando o programa...");
					executar = false;
					break;
				default:
					System.out.println("Opção inválida");
					System.out.println("");
					break;
			}
		}
		//Order order1 = new Order(1034, 150.00);
		//Order order2 = new Order(2282, 800.00);
		//Order order3 = new Order(1309, 95.90);

	}
}
