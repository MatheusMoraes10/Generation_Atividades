package Exercicios;

public class Funcionario {

	float totalcomissao = 0;
	
	private String nome;
	private String sobrenome;
	private String setor;
	private float salario;
	private float comissao;
	
	
	public Funcionario(String nome, String sobrenome, String setor, float salario, float comissao) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.setor = setor;
		this.salario = salario;
		this.comissao = comissao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	public float getComissao() {
		return comissao;
	}


	public void setComissao(float comissao) {
		this.comissao = comissao;	
	}
	
	
	
	public void visualizar() {
		totalcomissao = (comissao / 100) * salario;
		
		System.out.println("\nNome do funcionário: "+nome+"\nSobrenome: "+sobrenome+
				"\nSetor: "+setor+"\nSalario: "+salario+"\nComissão:"+totalcomissao);
	}
	
}
