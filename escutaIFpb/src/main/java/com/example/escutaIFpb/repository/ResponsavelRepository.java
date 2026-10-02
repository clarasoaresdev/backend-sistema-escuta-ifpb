package com.example.escutaIFpb.repository;

import com.example.escutaIFpb.entities.Responsavel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ResponsavelRepository extends CrudRepository<Responsavel, Long>, PagingAndSortingRepository<Responsavel, Long> {
}
