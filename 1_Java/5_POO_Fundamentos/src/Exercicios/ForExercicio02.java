package Exercicios;

/**
 * \n pula uma linha pois e
 *  é um caractere especial não considerdo para impressão.
 */

import java.util.Scanner;

public class ForExercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, cont, pares = 0, impares = 0;
		
		Scanner leitura = new Scanner(System.in);
		
		for(cont=1;cont<=10;cont++) {
			System.out.print("\nDigite o "+cont+"° número: ");
			numero = leitura.nextInt();
			if (numero % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		System.out.println("Total número pares: "+pares);
		System.out.println("Total número ímpares: "+impares);
	}

}

