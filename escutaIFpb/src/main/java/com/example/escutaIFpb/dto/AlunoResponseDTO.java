package com.example.escutaIFpb.dto;

import com.example.escutaIFpb.entities.Aluno;
import com.example.escutaIFpb.entities.Cursos;

import java.util.Date;

public record AlunoResponseDTO(Long id, String nome, Long cpf, Date dataNascimento, Long matricula, String email, Cursos curso) {

    public AlunoResponseDTO(Aluno aluno){
        this(aluno.getId(), aluno.getNome(), aluno.getCpf(), aluno.getDataNascimento(), aluno.getMatricula(), aluno.getEmail(), aluno.getNomeCurso());

    }
}
