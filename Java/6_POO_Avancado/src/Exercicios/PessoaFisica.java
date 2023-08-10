package Exercicios;

public class PessoaFisica extends Cliente {

	private int cpf;
	private String bandeiraDoCartao;
	private int codigoVerificacaoCartao;
	
	
	public PessoaFisica (String nomeCliente, String produto, int idade, int cadastro, int valorproduto, int cpf,
			String bandeiraDoCartao, int codigoVerificacaoCartao) {
		super(nomeCliente, produto, idade, cadastro, valorproduto);
		this.cpf = cpf;
		this.bandeiraDoCartao = bandeiraDoCartao;
		this.codigoVerificacaoCartao = codigoVerificacaoCartao;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getBandeiraDoCartao() {
		return bandeiraDoCartao;
	}


	public void setBandeiraDoCartao(String bandeiraDoCartao) {
		this.bandeiraDoCartao = bandeiraDoCartao;
	}


	public int getCodigoVerificacaoCartao() {
		return codigoVerificacaoCartao;
	}


	public void setCodigoVerificacaoCartao(int codigoVerificacaoCartao) {
		this.codigoVerificacaoCartao = codigoVerificacaoCartao;
	}
	
	
	public void visualizar() {
		
		System.out.println("\nNome: "+getNomeCliente()+"\nidade:"+getIdade()+
		"\nCpf: "+cpf+"\nCódigo cartão: "+codigoVerificacaoCartao);
	}
	
}
