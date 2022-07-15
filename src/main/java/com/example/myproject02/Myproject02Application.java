package com.example.myproject02;

import com.example.myproject02.domain.entity.Cliente;
import com.example.myproject02.domain.entity.Pedido;
import com.example.myproject02.domain.repository.ClienteRepository;
import com.example.myproject02.domain.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class Myproject02Application {

	@Bean
	public CommandLineRunner init(@Autowired ClienteRepository clienteRepository, @Autowired PedidoRepository pedidoRepository) {
		return args -> {
			Cliente cliente1 = new Cliente();
			cliente1.setNome("Marcos");
			System.out.println("Salvando Cliente");
			clienteRepository.save(cliente1);


			System.out.println("Resgistrando pedido");
			Pedido p1 = new Pedido();
			p1.setCliente(cliente1);
			p1.setDataPedido(LocalDate.now());
			p1.setTotal(BigDecimal.valueOf(100));
			pedidoRepository.save(p1);


			Pedido p2 = new Pedido();
			p2.setCliente(cliente1);
			p2.setDataPedido(LocalDate.now());
			p2.setTotal(BigDecimal.valueOf(200));
			pedidoRepository.save(p2);

		};
	}



	public static void main(String[] args) {
		SpringApplication.run(Myproject02Application.class, args);
	}
}
