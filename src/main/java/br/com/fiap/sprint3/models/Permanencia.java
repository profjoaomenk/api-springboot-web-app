package br.com.fiap.sprint3.models;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Entity
@Table(name = "TB_PERMANENCIA")
@SequenceGenerator(name = "permanencia", sequenceName = "SQ_TB_PERMANENCIA", allocationSize = 1)
public class Permanencia {

    @Id
    @GeneratedValue(generator = "permanencia", strategy = GenerationType.SEQUENCE)
    @Column(name = "cd_permanencia")
    private Long id;

    @Column(name = "cd_cliente")
    private Long idCliente;

    @Column(name = "cd_estacionamento")
    private Long idEstacionamento;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_entrada")
    private Date dtEntrada;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_saida")
    private Date dtSaida;
}
