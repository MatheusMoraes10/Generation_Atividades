package Exercicios;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*private String nomeCliente;
			private String produto;
			private int idade;
			private int cadastro;
			private int valorproduto;
			 */
		
		PessoaFisica cliente1 = new PessoaFisica("Matheus","Chinelo",24,123,20,111111111,"Visa",999);
		PessoaFisica cliente2 = new PessoaFisica("Jordan","Chuteira Nike",35,237,350,111111111,"Visa",999);
		PessoaJuridica cliente3 = new PessoaJuridica("Luiza","Chinelo",24,123,20,2030405060,"jelly Beans");
		PessoaJuridica cliente4 = new PessoaJuridica("Rafaelo","Chinelo",24,123,20,777777777,"Nougat");
		
		cliente1.visualizar();
		
		cliente2.visualizar();
		
		cliente3.visualizar();
		
		cliente4.visualizar();
	}

}
