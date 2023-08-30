package Exercicios;

import java.util.Scanner;

public class DoWhileExercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0, soma = 0;
		
		Scanner leitura = new Scanner(System.in);
		
		do {
			System.out.print("\nDigite um número: ");
			cont = leitura.nextInt();
			if (cont > 0) {
				soma += cont;
			}
		}while(cont != 0);
		System.out.print("A soma dos números positivos é: "+soma);
	}

}
