package com.example.escutaIFpb.dto;

import com.example.escutaIFpb.entities.Gestor;

public record GestorResponseDTO(Integer matricula, String nome, String email) {

    public GestorResponseDTO(Gestor gestor){
        this(gestor.getMatricula(),  gestor.getNome(), gestor.getEmail());
    }
}
