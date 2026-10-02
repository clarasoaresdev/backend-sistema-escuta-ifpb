package com.example.escutaIFpb.entities;

import com.example.escutaIFpb.dto.ReportRequestDTO;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_REGISTROS")
public class Report {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

    private Date dataHora;
    private Integer cpfOuMatricula;
    private String nome;
    private String email;
    private TipoMembro tipoMembro;
    private Cursos curso;

    private String titulo;
    private String conteudo;
    private String foto;

    public Report(){}

    public Report(ReportRequestDTO dadosReport){
        this.dataHora = dadosReport.dataHora();
        this.cpfOuMatricula = dadosReport.cpfOuMatricula();
        this.nome = dadosReport.nome();
        this.email = dadosReport.email();
        this.tipoMembro = dadosReport.tipoMembro();
        this.curso = dadosReport.curso();
        this.titulo = dadosReport.titulo();
        this.conteudo = dadosReport.conteudo();
        this.foto = dadosReport.foto();
    }
}
