package Exercicios;

import java.util.Scanner;

/**
 * %.2f formata para duas casas decimais um valor en float sedo 0.2 duas casas 0.3 3 casa etc
 * %.2d Formata numeros inteiros sedo 0.2 duas casas 0.3 3 casa etc
 * **/

public class DoWhileExercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0, somamulti3 = 0;
		float media, qtdmulti3 = 0;
		Scanner leitura = new Scanner(System.in);
		
		do {
			System.out.print("\nDigite um número: ");
			cont = leitura.nextInt();
			if (cont > 0 && cont % 3 == 0) {
				somamulti3 += cont;
				qtdmulti3++;
			}
		}while(cont != 0);
		media = somamulti3 / qtdmulti3;
		System.out.println("A média de todos os números múltiplos de 3 é: "+ media);
	}

}