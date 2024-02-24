package br.com.pagamento.sistema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation => Indica que é um projeto SpringBoot
@SpringBootApplication
public class SistemaApplication {

	public static void main(String[] args) {
		// Ele cria um contexto que é uma aplicação Spring
		// Varredura, das classes antes de iniciar
		// Inicia a Aplicação
		SpringApplication.run(SistemaApplication.class, args);
	}

}
