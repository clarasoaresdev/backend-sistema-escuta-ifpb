package com.example.escutaIFpb.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="TB_COORDENADOR")
public class Coordenador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Integer matricula;
    private String nome;
    private String email;
    private ClassificacaoCoordenacao nomeCoordenacao;

    public Coordenador(){}


}
