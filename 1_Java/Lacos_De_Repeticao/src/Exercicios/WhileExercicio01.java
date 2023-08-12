package Exercicios;

import java.util.Scanner;

public class WhileExercicio01 {

	public static void main(String[] args) {
		
		int cont = 0, menores21 = 0, maiores50 = 0;
		
		Scanner leitura = new Scanner(System.in);
		
		while(cont >= 0) {
			System.out.print("\n Digite uma idade: ");
			cont = leitura.nextInt();
			if(cont < 21) {
				menores21++;
			}else if(cont > 50) {
				maiores50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: "+menores21);
		System.out.println("Total de pessoas maiores de 50 anos: "+maiores50);
	}
}
