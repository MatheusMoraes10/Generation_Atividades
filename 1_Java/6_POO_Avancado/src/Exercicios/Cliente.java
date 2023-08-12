package Exercicios;

public class Cliente {
	
	int parcelas = 0;

	/// atributos
	private String nomeCliente;
	private String produto;
	private int idade;
	private int cadastro;
	private int valorproduto;
	
	//Contrutor
	public Cliente(String nomeCliente, String produto, int idade, int cadastro, int valorproduto) {
		super();
		this.nomeCliente = nomeCliente;
		this.produto = produto;
		this.idade = idade;
		this.cadastro = cadastro;
		this.valorproduto = valorproduto;
	}
	//métodos
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	public int getvalorproduto() {
		return valorproduto;
	}

	public void setvalorproduto(int valorproduto) {
		this.valorproduto = valorproduto;
	}

	
	public void visualizar() {
		
		if(valorproduto < 50) {
			parcelas = 1;
		}else if(valorproduto >= 50 && valorproduto <= 500) {
			parcelas = 3;
		}else if(valorproduto >= 500 && valorproduto <= 2000) {
		parcelas = 6;
		}
		
		System.out.println("\nNome do cliente: "+nomeCliente+"\nComprou o produto: "+produto+"\nPossui a idade: "+idade+
				"\nCadastro do Cliente: "+cadastro+"\nValor pago no produto: "+valorproduto+"\nPode ser parcelado em: "+parcelas+" Sem Juros!!");
	}
	
	
}
