package com.Apiproj.apinotas.controller;

import com.Apiproj.apinotas.model.Aluno;
import com.Apiproj.apinotas.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos") //localhost:8080/alunos
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService alunoService){
        this.service = alunoService;
    }
    @GetMapping
    public List<Aluno> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")// localhost:8080/alunos/{id}
    public Aluno buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id).orElse(null);
    }

    @PatchMapping
    public Aluno salvar(@RequestBody Aluno aluno){
        return service.salvar(aluno);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
