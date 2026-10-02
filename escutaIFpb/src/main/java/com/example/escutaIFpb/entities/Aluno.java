package com.example.escutaIFpb.entities;

import com.example.escutaIFpb.dto.AlunoRequestDTO;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "TB_ALUNO")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private Integer cpf;
    private Date dataNascimento;
    private Integer matricula;
    private String email; //serve p notificar quando a resposta chegar, enfim...
    private Cursos nomeCurso;

    public Aluno() {}

    public Aluno(AlunoRequestDTO dadosAluno){
        this.nome = dadosAluno.nome();
        this.cpf = dadosAluno.cpf();
        this.dataNascimento = dadosAluno.dataNascimento();
        this.matricula = dadosAluno.matricula();
        this.email = dadosAluno.email();
        this.nomeCurso = dadosAluno.curso();
    }
}
