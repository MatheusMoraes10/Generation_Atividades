package Exercicios;

public class Gerente extends Funcionario {

	int tamanhoEquipe;
	String graduacao;
	int experiencia;
	
	public Gerente(String nome, String sobrenome, String setor, float salario, float comissao, int tamanhoEquipe,
			String graduacao, int experiencia) {
		super(nome, sobrenome, setor, salario, comissao);
		this.tamanhoEquipe = tamanhoEquipe;
		this.graduacao = graduacao;
		this.experiencia = experiencia;
	}

	public int getTamanhoEquipe() {
		return tamanhoEquipe;
	}

	public void setTamanhoEquipe(int tamanhoEquipe) {
		this.tamanhoEquipe = tamanhoEquipe;
	}

	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public void visualizar() {
		
		System.out.println("\nNome: "+getNome()+"\nSobrenome: "+getSobrenome()+
				"\nTamanho da Equipe: "+tamanhoEquipe+"\nGraduação: "+graduacao+"\nExperiencia "+experiencia+" Anos");
		
	}
	
}
