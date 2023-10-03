package com.projetorh.colaborador.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity//Declara essa classe também como uma entidade
@Table(name = "colaboradores")//Dá o nome da tabela no BD 
@Getter//Utilizando o lombok essa annotation gera o getters para mim
@Setter//Utilizando o lombok essa annotation gera o setters para mim
public class Colaborador {
    
    @Id//Faz o Banco entender que o id será minha chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Essa annotation seria o auto increment
    private Long id;

    private String nome;

    private String cpf;

    private String rg;

    private Date dtnascimento;

    private String cargo;

    private Float salario;

    private String senioridade;

    private String telefone;

    @OneToOne
    @JoinColumn(name = "endereco", referencedColumnName = "id")
    private Endereco endereco;

}
