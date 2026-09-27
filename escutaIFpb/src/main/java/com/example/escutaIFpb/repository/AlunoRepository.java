package com.example.escutaIFpb.repository;

import com.example.escutaIFpb.entities.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AlunoRepository extends CrudRepository<Aluno, Long>, PagingAndSortingRepository<Aluno, Long> {
}
