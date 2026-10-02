package com.example.escutaIFpb.dto;

import com.example.escutaIFpb.entities.ClassificacaoCoordenacao;
import com.example.escutaIFpb.entities.Coordenador;

public record CoordenadorResponseDTO(Integer matricula, String nome, String email, ClassificacaoCoordenacao nomeCoordenacao) {

    public  CoordenadorResponseDTO(Coordenador coordenador){
        this(coordenador.getMatricula(), coordenador.getNome(), coordenador.getEmail(), coordenador.getNomeCoordenacao());
    }
}
