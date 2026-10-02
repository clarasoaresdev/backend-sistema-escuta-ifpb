package com.example.escutaIFpb.repository;

import com.example.escutaIFpb.entities.Coordenador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CoordenadorRepository extends CrudRepository<Coordenador, Long>, PagingAndSortingRepository<Coordenador, Long> {
}
