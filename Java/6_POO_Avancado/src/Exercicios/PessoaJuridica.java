package Exercicios;

public class PessoaJuridica extends Cliente {

	private int cnpj;
	private String nomeEmpresa;
	
	public PessoaJuridica(String nomeCliente, String produto, int idade, int cadastro, int valorproduto, int cnpj,
			String nomeEmpresa) {
		super(nomeCliente, produto, idade, cadastro, valorproduto);
		this.cnpj = cnpj;
		this.nomeEmpresa = nomeEmpresa;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public void visualizar() {
		System.out.println("\nNome Funcionário que comprou: "+getNomeCliente()+
				"\nCNPJ: "+cnpj+"\nNome da Empresa: "+nomeEmpresa);
	};
	
	
}

