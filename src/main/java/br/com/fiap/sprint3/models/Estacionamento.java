package br.com.fiap.sprint3.models;


import ch.qos.logback.classic.gaffer.GafferConfigurator;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "TB_ESTACIONAMENTO")
@SequenceGenerator(name = "estacionamento", sequenceName = "SQ_TB_VAGAS", allocationSize = 1)
public class Estacionamento {

    @Id
    @GeneratedValue(generator = "estacionamento", strategy = GenerationType.SEQUENCE)
    @Column(name = "cd_estacionamento")
    private Long id;

    @Column(name = "nm_nome")
    private String nome;

    @Column(name = "vl_preco")
    private BigDecimal valor;
}
