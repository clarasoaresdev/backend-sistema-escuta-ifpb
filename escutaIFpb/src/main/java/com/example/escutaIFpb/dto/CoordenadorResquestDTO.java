package com.example.escutaIFpb.dto;

import com.example.escutaIFpb.entities.ClassificacaoCoordenacao;

public record CoordenadorResquestDTO(Integer matricula, String nome, String email, ClassificacaoCoordenacao nomeCoordenacao) {
}
