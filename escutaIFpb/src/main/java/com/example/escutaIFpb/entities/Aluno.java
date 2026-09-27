package com.example.escutaIFpb.entities;

import com.example.escutaIFpb.dto.AlunoRequestDTO;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="TB_Aluno")
@Data
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private Long cpf;
    private Date dataNascimento;
    private Long matricula;
    private String email;
    private Cursos nomeCurso;


    public Aluno(AlunoRequestDTO dadosAluno){
        this.nome = dadosAluno.nome();
        this.cpf = dadosAluno.cpf();
        this.dataNascimento = dadosAluno.dataNascimento();
        this.matricula = dadosAluno.matricula();
        this.email = dadosAluno.email();
        this.nomeCurso = dadosAluno.curso();
    }
}
