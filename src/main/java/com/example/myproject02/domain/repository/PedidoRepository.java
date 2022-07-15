package com.example.myproject02.domain.repository;

import com.example.myproject02.domain.entity.Cliente;
import com.example.myproject02.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {


}
