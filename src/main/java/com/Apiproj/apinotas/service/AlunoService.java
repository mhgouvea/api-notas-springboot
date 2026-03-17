package com.Apiproj.apinotas.service;

import com.Apiproj.apinotas.model.Aluno;
import com.Apiproj.apinotas.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service


public class AlunoService {
    private final AlunoRepository repository;
    public AlunoService(AlunoRepository alunoRepository){
        this.repository = alunoRepository;
    }
    public List<Aluno> listar(){
        return this.repository.findAll();
    }

    public Optional<Aluno> buscarPorId(Long id){
        return repository.findById(id);
    }

    public Aluno salvar(Aluno aluno){
        return repository.save(aluno);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
