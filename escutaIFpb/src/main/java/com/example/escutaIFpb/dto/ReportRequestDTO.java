package com.example.escutaIFpb.dto;

import com.example.escutaIFpb.entities.Cursos;
import com.example.escutaIFpb.entities.TipoMembro;

import java.util.Date;

public record ReportRequestDTO(Date dataHora, Integer cpfOuMatricula, String nome, String email, TipoMembro tipoMembro, Cursos curso, String titulo, String conteudo, String foto) {
}
