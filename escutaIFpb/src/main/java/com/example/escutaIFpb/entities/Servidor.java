package com.example.escutaIFpb.entities;


import com.example.escutaIFpb.dto.ServidorRequestDTO;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="TB_SERVIDOR")
public class Servidor {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

    private Integer cpfOuMatricula;
    private String nome;
    private String email;

    public Servidor(){}

    public Servidor (ServidorRequestDTO dadosServidor){
        this.cpfOuMatricula = dadosServidor.cpfOuMatricula();
        this.nome = dadosServidor.nome();
        this.email = dadosServidor.email();
    }
}
