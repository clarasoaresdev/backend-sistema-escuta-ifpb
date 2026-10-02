package com.example.escutaIFpb.dto;

import com.example.escutaIFpb.entities.Cursos;

import java.util.Date;

public record AlunoRequestDTO(String nome, Integer cpf, Date dataNascimento, Integer matricula, String email, Cursos curso) {
}
