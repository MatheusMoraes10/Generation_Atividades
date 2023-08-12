package Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueueExercicio01 {

	public static void main(String[] args) {
		
		int opcao = 1;
		String cliente;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1 - Adicionar Cliente na Fila");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Cliente da Fila");
		System.out.println("0 - Sair");
		System.out.println();
		System.out.println("*********************************");

		Queue<String> fila = new LinkedList<String>();
	
		//While que repete escolha do menu enquanto é menor que 0
		
		while (opcao != 0) {
			System.out.println("Entre com a opção desejada: ");
			opcao = leitura.nextInt();
			
			switch (opcao) {
				case 1:
					//Insere um cliente a fila não consegui usar o Interator para imprimir
					System.out.println("Digite o nome: ");
					cliente = leitura.next();
					fila.add(cliente);
					System.out.println();
					System.out.println("Fila: ");
					System.out.println(fila);
					System.out.println();
					System.out.println("Cliente Adicionado!");
					System.out.println();
				break;
				case 2:
					System.out.println("Lista de Clientes na Fila: ");
					System.out.println();
					System.out.println(fila);
					System.out.println();
				break;
				case 3:
					//Verifica se a fila está vazia e imprime se sim ou "Atende" um da fila como pedido pelo exercicio
 					if (fila.isEmpty() == true){
						System.out.println("A Fila está vazia!");
						System.out.println();
					}else{
						System.out.println(fila.remove());
						System.out.println();
						System.out.println("Fila: ");
						System.out.println();
						System.out.println(fila);
						System.out.println();
						System.out.println("Cliente foi Chamado!");
					}
					
				break;
				
			}
		
		}
		
		System.out.println("Programa Finalizado!");
	}

}
