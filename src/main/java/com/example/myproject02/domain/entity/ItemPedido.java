package com.example.myproject02.domain.entity;


import javax.persistence.*;

@Entity
@Table(name = "item_pedido")
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "pedido_ip")
    private Pedido pedidoId;

    @ManyToOne
    @JoinColumn(name = "produto_ip")
    private Produto produtoId;

    @Column(name = "quantidade")
    private Integer quantidade;

    public ItemPedido() {
    }

    public ItemPedido(Integer id, Pedido pedidoId, Produto produtoId, Integer quantidade) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pedido getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Pedido pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Produto getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Produto produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
