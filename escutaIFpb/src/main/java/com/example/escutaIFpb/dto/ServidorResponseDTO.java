package com.example.escutaIFpb.dto;

import com.example.escutaIFpb.entities.Servidor;

public record ServidorResponseDTO(Integer cpfOuMatricula, String nome, String email) {

    public ServidorResponseDTO(Servidor servidor){
        this(servidor.getCpfOuMatricula(), servidor.getNome(), servidor.getEmail());
    }
}
