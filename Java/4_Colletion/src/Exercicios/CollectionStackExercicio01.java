package Exercicios;

import java.util.Scanner;
import java.util.Stack;

public class CollectionStackExercicio01 {

	public static void main(String[] args) {
		
		int opcao = 1;
		String cliente;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1 - Adicionar Livro na pilha");
		System.out.println("2 - Listar todos os Livros");
		System.out.println("3 - Retirar Livro da pilha");
		System.out.println("0 - Sair");
		System.out.println();
		System.out.println("*********************************");

		Stack<String> pilha = new Stack<String>();
		
		while (opcao != 0) {
			System.out.println("Entre com a opção desejada: ");
			opcao = leitura.nextInt();
			
			switch (opcao) {
				case 1:
					//Insere um livro a pilha não consegui usar o Interator para imprimir
					System.out.println("Digite o nome: ");
					cliente = leitura.next();
					pilha.push(cliente);
					System.out.println();
					System.out.println("pilha: ");
					System.out.println(pilha);
					System.out.println();
					System.out.println("Livro Adicionado!");
					System.out.println();
				break;
				case 2:
					System.out.println("Lista de livros na pilha: ");
					System.out.println();
					System.out.println(pilha);
					System.out.println();
				break;
				case 3:
					//Verifica se a pilha está vazia e imprime se sim ou "Atende" um da fila como pedido pelo exercicio
 					if (pilha.isEmpty() == true){
						System.out.println("A Pilha está vazia!");
						System.out.println();
					}else{
						System.out.println(pilha.pop());
						System.out.println();
						System.out.println("Pilha: ");
						System.out.println();
						System.out.println(pilha);
						System.out.println();
						System.out.println("Um Livro foi retirado da pilha!");
					}
					
				break;
				
			}
		
		}
		
		System.out.println("Programa Finalizado!");
	}

}
