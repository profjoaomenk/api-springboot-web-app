package br.com.fiap.sprint3.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Table(name = "TB_PAGAMENTO")
@Entity
@SequenceGenerator(name = "pagamento", sequenceName = "SQ_TB_PAGAMENTO", allocationSize = 1)
public class Pagamento {

    @Id
    @GeneratedValue(generator = "pagamento", strategy = GenerationType.SEQUENCE)
    @Column(name = "cd_pagamento")
    private Long id;

    @Column(name = "cd_cliente")
    private Long idCliente;

    @Column(name = "nr_cartao")
    private Integer numeroCartao;

    @Column(name = "nm_titular")
    private String nomeTitular;

    @Column(name = "nr_cpf")
    private Long cpfTitular;

    @Column(name = "dt_vencimento")
    private Date vencimento;

    @Column(name = "nr_cvv")
    private Integer cvv;

    @Column(name = "ds_metodo")
    private String metodo;
}
