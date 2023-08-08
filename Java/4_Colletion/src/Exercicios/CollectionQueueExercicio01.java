package Exercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueueExercicio01 {

	public static void main(String[] args) {
		
		int opcao = 0, tamanhofila = 0;
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
		
		Iterator<String> interacao = fila.iterator();
		
		System.out.println("Entre com a opção desejada: ");
		opcao = leitura.nextInt();
		
		while (opcao != 0) {
			System.out.println("Entre com a opção desejada: ");
			opcao = leitura.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.println("Digite o nome: ");
					cliente = leitura.nextLine();
					fila.add(cliente);
					System.out.println();
					System.out.println("Fila: ");
					tamanhofila = fila.size();
					while(interacao.hasNext()) {
						System.out.println(interacao.next());
					}
					System.out.println();
					System.out.println("Cliente Adicionado!");
				break;
				case 2:
					while(interacao.hasNext()) {
						System.out.println(interacao.next());
					}
				break;
				case 3:
					if (fila.isEmpty() == true){
						System.out.println("A Fila está vazia!");
					}else {
						System.out.println(fila.remove());
					}
					System.out.println();
					System.out.println("Fila: ");
					while(interacao.hasNext()) {
						System.out.println(interacao.next());
					}
					System.out.println();
					System.out.println("Cliente foi Chamado!");
				break;
				
			}
		
		}
		
		System.out.println("Programa Finalizado!");
		
	}

}
