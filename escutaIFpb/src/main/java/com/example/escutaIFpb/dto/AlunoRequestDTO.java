package com.example.escutaIFpb.dto;

import com.example.escutaIFpb.entities.Cursos;

import java.util.Date;

public record AlunoRequestDTO(String nome, Long cpf, Date dataNascimento, Long matricula, String email, Cursos curso) {
}
