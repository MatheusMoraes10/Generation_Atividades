package Exercicios;

import java.util.Scanner;

public class ForExercicio01 {

	public static void main(String[] args) {
	
		int entrada1,entrada2,cont;
		
		Scanner leitura = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro número do intervalo: ");
		entrada1 = leitura.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		entrada2 = leitura.nextInt();
		
		if(entrada1 < entrada2) {
			for(cont=entrada1;cont<=entrada2;cont++) {
				if(cont % 3 == 0 && cont % 5 ==0) {
					System.out.println(cont+" é múltiplo de 3 e 5");
				}
			}
		}else{
			System.out.println("Intervalo inválido!");
		}
	}
}
