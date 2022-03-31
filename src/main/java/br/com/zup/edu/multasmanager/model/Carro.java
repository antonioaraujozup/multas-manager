package br.com.zup.edu.multasmanager.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String placa;

    @Column(nullable = false, length = 11)
    private String renavam;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private String chassi;

    @Column(nullable = false)
    private Integer ano;

    @Column(nullable = false)
    private BigDecimal valor;

    @ManyToOne(optional = false)
    private Cliente cliente;

    public Carro(String placa, String renavam, String marca, String modelo, String chassi, Integer ano, BigDecimal valor, Cliente cliente) {
        this.placa = placa;
        this.renavam = renavam;
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.ano = ano;
        this.valor = valor;
        this.cliente = cliente;
    }

    /**
     * @deprecated Construtor exclusivo para uso do Hibernate.
     */
    @Deprecated
    public Carro() {
    }

    public Long getId() {
        return id;
    }
}
