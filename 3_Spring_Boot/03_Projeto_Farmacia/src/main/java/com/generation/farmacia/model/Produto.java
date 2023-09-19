package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.generation.farmacia.model.Categoria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto_farmacia")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Nome é Obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo caracterisitcas é Obrigatório!")
	@Size(min = 10, max = 1000, message = "o atributo caracterisitcas deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String caracterisitcas;

	@NotBlank(message = "O atributo Marca é Obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo marca deve conter no mínimo 05 e no máximo 100 caracteres")
	private String marca;
	
	@NotBlank(message = "O atributo preco é Obrigatório!")
	private double preco;
	
	@NotBlank(message = "O atributo custo é Obrigatório!")
	private double custo;

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

	public String getCaracterisitcas() {
		return caracterisitcas;
	}

	public void setCaracterisitcas(String caracterisitcas) {
		this.caracterisitcas = caracterisitcas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}