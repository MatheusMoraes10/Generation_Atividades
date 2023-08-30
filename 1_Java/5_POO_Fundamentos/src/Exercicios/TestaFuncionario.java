package Exercicios;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new  Funcionario("Matheus","Moraes","Desenvolvimento",20000,15);
		Funcionario funcionario2 = new  Funcionario("Felisberto","Silva","Agro-Negócios",100000,5);
		
		funcionario1.visualizar();
		funcionario2.visualizar();
	}

}
