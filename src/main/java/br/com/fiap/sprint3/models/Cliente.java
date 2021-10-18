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

@Data
@Entity
@Table(name = "TB_CLIENTE")
@SequenceGenerator(name = "vagas", sequenceName = "SQ_TB_VAGAS", allocationSize = 1)
public class Cliente {

    @Id
    @GeneratedValue(generator = "vagas", strategy = GenerationType.SEQUENCE)
    @Column(name = "cd_cliente")
    private Long id;

    @Column(name = "nm_nome")
    private String nome;

    @Column(name = "nr_cpf")
    private Long cpf;

    @Column(name = "ds_email")
    private String email;

    @Column(name = "ds_senha")
    private String senha;
}
