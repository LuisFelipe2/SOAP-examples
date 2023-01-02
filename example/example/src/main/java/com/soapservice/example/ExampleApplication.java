package com.soapservice.example;

import com.soapservice.example.service.CertidaoNascimento;
import com.soapservice.example.service.impl.CertidaoNascimentoImpl;
import jakarta.xml.ws.Endpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {

		CertidaoNascimento service = new CertidaoNascimentoImpl();
		Endpoint.publish("http://localhost:8082/service/certidao",service);
		System.out.println("Serviço publicado com sucesso");

		SpringApplication.run(ExampleApplication.class, args);
	}

}
