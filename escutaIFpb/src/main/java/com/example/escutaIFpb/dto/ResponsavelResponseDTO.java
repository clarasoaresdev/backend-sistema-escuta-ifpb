package com.example.escutaIFpb.dto;

import com.example.escutaIFpb.entities.Responsavel;

public record ResponsavelResponseDTO(Integer cpf, String nome, String email) {

    public ResponsavelResponseDTO(Responsavel responsavel){
        this(responsavel.getCpf(), responsavel.getNome(), responsavel.getEmail());
    }

}
