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
		
		Cliente cliente1 = new Cliente("Matheus","Chinelo",24,123,20);
		Cliente cliente2 = new Cliente("Jordan","Chuteira Nike",35,237,350);
		
		cliente1.visualizar();
		cliente2.visualizar();
	}

}
