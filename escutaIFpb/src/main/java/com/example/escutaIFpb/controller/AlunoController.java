package com.example.escutaIFpb.controller;


import com.example.escutaIFpb.dto.AlunoRequestDTO;
import com.example.escutaIFpb.entities.Aluno;
import com.example.escutaIFpb.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:5173", allowedHeaders = "*")
@RestController
@RequestMapping("aluno") // aq é p fazer um endpoint p requests de aluno, aí fica tipo backend/aluno/getId
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;


    @PostMapping
    public void adicionarAluno(@RequestBody AlunoRequestDTO alunoDTO){
        Aluno aluno = new Aluno(alunoDTO);
        alunoRepository.save(aluno);
    }
}
