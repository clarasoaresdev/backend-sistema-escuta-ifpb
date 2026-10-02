package com.example.escutaIFpb.entities;

import com.example.escutaIFpb.dto.GestorRequestDTO;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="TB_GESTOR")
public class Gestor {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

    private Integer matricula;
    private String nome;
    private String email;

    public Gestor(){}

    public void Gestor (GestorRequestDTO dadosGestor){
        this.matricula = dadosGestor.matricula();
        this.nome = dadosGestor.nome();
        this.email = dadosGestor.email();
    }
}
