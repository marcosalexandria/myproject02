package com.example.myproject02.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {
    private Integer id;
    private Cliente clienteId;
    private LocalDate dataPedido;
    private BigDecimal total;

    public Pedido() {
    }

    public Pedido(Integer id, Cliente clienteId, LocalDate dataPedido, BigDecimal total) {
        this.id = id;
        this.clienteId = clienteId;
        this.dataPedido = dataPedido;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getClienteId() {
        return clienteId;
    }

    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
