package Exercicios;

import java.util.Scanner;

public class VetoresExercicio01 {

	public static void main(String[] args) {
		int [] vetor = new int [10];
		int cont, numero, posicao = -1;
		
		vetor[0] = 2;
		vetor[1] = 5;
		vetor[2] = 1;
		vetor[3] = 3;
		vetor[4] = 4;
		vetor[5] = 9;
		vetor[6] = 7;
		vetor[7] = 8;
		vetor[8] = 10;
		vetor[9] = 6;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("vetor ");
		
		//For para escrever números na tela
		
		for(cont=0;cont<10;cont++) {
			
			System.out.print("|"+vetor[cont]+"|");
			
		}
		//Sistema de captura número desejado pelo usuário
		
		System.out.print("\nDigite o número que você deseja encontrar: ");
		numero = leitura.nextInt();
		
		//Estrutura for para percorrer o vetor
		
		for(cont=0;cont<10;cont++) {
			if(vetor[cont] == numero) {
				posicao = cont;
			}
		}
		
		//Estrutura para sinalizaram se encontrou o número no vetor
		
		if(posicao != -1) {
			System.out.println("O número "+numero+" está localizado na posição: "+posicao);
		}else {
			System.out.println("O número "+numero+" não foi encontrado!");
		}
	}

}
