package com.example.escutaIFpb.repository;

import com.example.escutaIFpb.entities.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReportRepository extends CrudRepository<Report, Long>, PagingAndSortingRepository<Report, Long> {
}
