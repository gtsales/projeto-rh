package com.projetorh.colaborador.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projetorh.colaborador.model.Colaborador;

@Repository
public interface ColaboradorRepositorio extends CrudRepository<Colaborador, Long>{
    
}
