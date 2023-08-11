package Exercicios;

public class Vendedor extends Funcionario {

	int numeroVendas;
	int experiencia;
	String tipoVenda;
	
	public Vendedor(String nome, String sobrenome, String setor, float salario, float comissao, int numeroVendas,
			int experiencia, String tipoVenda) {
		super(nome, sobrenome, setor, salario, comissao);
		this.numeroVendas = numeroVendas;
		this.experiencia = experiencia;
		this.tipoVenda = tipoVenda;
	}

	public int getNumeroVendas() {
		return numeroVendas;
	}

	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getTipoVenda() {
		return tipoVenda;
	}

	public void setTipoVenda(String tipoVenda) {
		this.tipoVenda = tipoVenda;
	}
	
	
	public void visualizar() {
		
		System.out.println("\nNome: "+getNome()+"\nNumero de vendas: "+numeroVendas+
				"\nExepriencia: "+experiencia+" Anos"+"\nTipos de produto que vende: "+tipoVenda);

	}
	
	
}
