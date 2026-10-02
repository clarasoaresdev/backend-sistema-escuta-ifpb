package com.example.escutaIFpb.dto;

import com.example.escutaIFpb.entities.Cursos;
import com.example.escutaIFpb.entities.Report;
import com.example.escutaIFpb.entities.TipoMembro;

import java.util.Date;

public record ReportResponseDTO(Date dataHora, Integer cpfOuMatricula, String nome, String email, TipoMembro tipoMembro, Cursos curso, String titulo, String conteudo, String foto) {
    public ReportResponseDTO(Report report){
        this(report.getDataHora(), report.getCpfOuMatricula(), report.getNome(), report.getEmail(), report.getTipoMembro(), report.getCurso(), report.getTitulo(), report.getConteudo(), report.getFoto());
    }
}
