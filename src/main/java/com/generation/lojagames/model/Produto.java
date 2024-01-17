package com.generation.lojagames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 5, max = 100, message = "O nome deve ter no mínimo 5 caracteres e no máximo 100")
	@NotBlank(message = "Atributo nome é obrigatório.")
	private String nome;

	@NotNull(message = "Atributo preço é obrigatório.")
	private BigDecimal preco;

	@Size(min = 10, max = 1000, message = "A descrição deve ter no mínimo 10 caracteres e no máximo 1000.")
	private String descricao;

	@Size(min = 3, max = 10, message = "A classificação deve ter no mínimo 3 caracteres e no máximo 10.")
	private String classificacao_etaria;

	@Size(min = 10, max = 1000, message = "O desenvolvedor deve ter no mínimo 10 caracteres e no máximo 1000")
	@NotBlank(message = "Atributo descrição é obrigatório")
	private String desenvolvedor;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getClassificacao_etaria() {
		return classificacao_etaria;
	}

	public void setClassificacao_etaria(String classificacao_etaria) {
		this.classificacao_etaria = classificacao_etaria;
	}

	public String getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
