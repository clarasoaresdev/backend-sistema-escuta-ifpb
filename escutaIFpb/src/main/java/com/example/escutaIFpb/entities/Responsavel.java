package com.example.escutaIFpb.entities;

import com.example.escutaIFpb.dto.ResponsavelRequestDTO;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="TB_RESPONSAVELs")
public class Responsavel {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

    private Integer cpf;
    private String nome;
    private String email;

    public Responsavel(){}

    public Responsavel (ResponsavelRequestDTO dadosResponsavel){
        this.cpf = dadosResponsavel.cpf();
        this.nome = dadosResponsavel.nome();
        this.email = dadosResponsavel.email();
    }

}
