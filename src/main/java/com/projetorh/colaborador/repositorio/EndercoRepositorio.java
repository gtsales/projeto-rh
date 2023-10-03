package com.projetorh.colaborador.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projetorh.colaborador.model.Endereco;

@Repository
public interface EndercoRepositorio extends CrudRepository<Endereco, Long>{
    
}
