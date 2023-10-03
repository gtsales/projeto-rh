package com.projetorh.colaborador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetorh.colaborador.model.Endereco;
import com.projetorh.colaborador.repositorio.EndercoRepositorio;

@RestController
@RequestMapping("/endereco")
public class EnderecoControle {
    
    @Autowired
    private EndercoRepositorio endereco_repositorio;

    @PostMapping("/cadastrar")
    public Endereco cadastrar(@RequestBody Endereco obj){

        return endereco_repositorio.save(obj);

    }
}
