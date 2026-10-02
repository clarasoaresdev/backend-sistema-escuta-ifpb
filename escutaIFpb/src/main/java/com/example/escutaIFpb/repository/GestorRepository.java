package com.example.escutaIFpb.repository;

import com.example.escutaIFpb.entities.Gestor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GestorRepository extends CrudRepository<Gestor, Long>, PagingAndSortingRepository<Gestor, Long> {
}
