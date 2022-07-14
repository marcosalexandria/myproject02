package com.example.myproject02;

import com.example.myproject02.domain.entity.Cliente;
import com.example.myproject02.domain.repositorio.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Myproject02Application {

	@Bean
	public CommandLineRunner init(ClienteRepository clienteRepository) {
		return args -> {
			Cliente cliente1 = new Cliente();
			cliente1.setNome("Marcos");
			clienteRepository.save(cliente1);

			Cliente cliente2 = new Cliente();
			cliente2.setNome("Heloisa");
			clienteRepository.save(cliente2);

			System.out.println();
			System.out.println("Buscando todos os clientes");
			List<Cliente> listClientes = clienteRepository.findAll();
			for (Cliente todos: listClientes) {
				System.out.println(todos);
			}

			System.out.println();
			System.out.println("Atualizando os nomes dos clientes");
			listClientes.forEach(todos-> {
				todos.setNome(todos.getNome() + " Atualizado");
				clienteRepository.save(todos);
			});

			System.out.println();
			System.out.println("Nomes atualizados");
			listClientes = clienteRepository.findAll();
			for (Cliente todos: listClientes) {
				System.out.println(todos);
			}


			System.out.println();
			System.out.println("Buscando por id");
			System.out.println(clienteRepository.findById(2));

			System.out.println();
			System.out.println("Buscando por nome");
			System.out.println(clienteRepository.findByNomeLike("Marcos Atualizado"));

			System.out.println();
			System.out.println("Deletando um");
			clienteRepository.delete(cliente1);

			System.out.println();
			System.out.println("Lista Atualizada");
			List<Cliente> listAtual = clienteRepository.findAll();
			for (Cliente todos:
				 listAtual) {
				System.out.println(todos);
			}

			System.out.println();
			System.out.println("Verificando se o id existe");
			System.out.println(clienteRepository.existsById(2));


		};
	}



	public static void main(String[] args) {
		SpringApplication.run(Myproject02Application.class, args);
	}
}
