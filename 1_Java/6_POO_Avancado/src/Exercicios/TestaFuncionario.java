package Exercicios;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente funcionario1 = new  Gerente("Matheus","Moraes","Desenvolvimento",20000,15,10,"Ciencias da Computação",5);
		Gerente funcionario2 = new  Gerente("Tulio","Michelangelo","Finanças",10000,5,8,"Ciências contábeis",5);
		Vendedor funcionario3 = new  Vendedor("Rebeca","Yellow","Vendas",7000,20,50,3,"Eletrodomesticos");
		Vendedor funcionario4 = new  Vendedor("Wilfred","Michel","Vendas",12000,20,75,7,"Roupas");
		
		funcionario1.visualizar();
		funcionario2.visualizar();
		funcionario3.visualizar();
		funcionario4.visualizar();
		
	}

}
