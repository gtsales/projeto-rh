package com.projetorh.colaborador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity//Declara essa classe também como uma entidade
@Table(name = "endereco")//Dá o nome da tabela no BD 
@Getter//Utilizando o lombok essa annotation gera o getters para mim
@Setter//Utilizando o lombok essa annotation gera o setters para mim
public class Endereco {
    
    
    @Id//Faz o Banco entender que o id será minha chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Essa annotation seria o auto increment
    private Long id;

    private String estado;

    private String cidade;

    private String bairro;

    private String rua;

    private String cep;

    private String numcasa;


}
