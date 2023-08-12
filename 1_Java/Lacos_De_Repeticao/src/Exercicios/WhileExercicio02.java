package Exercicios;

import java.util.Scanner;

public class WhileExercicio02 {

	public static void main(String[] args) {
		
		int idade, sexo = 0, categoria = 0, totback = 0, mfront = 0, mfull = 0, hmobille = 0;
		String continuar = "S";

		Scanner leitura = new Scanner(System.in);
		
		while(continuar != "N") {
			System.out.print("\nDigite a Idade: ");
			idade = leitura.nextInt();
			System.out.print("\nDigite o Sexo 1 - Feminino 2 - Masculino 3 - Outros: ");
			sexo = leitura.nextInt();
			System.out.print("\nDesenvolvedor: 1-Backend, 2-Frontend, 3-Mobille, 4-FullStack: ");
			categoria = leitura.nextInt();
			if(categoria == 1) {
				totback++;
			}
			if(sexo == 1 && categoria == 2) {
				mfront++;
			}else if(categoria == 4 && idade < 30) {
				mfull++;
			}
			if(sexo == 2 && categoria == 3 && idade > 40) {
				hmobille++;
			}
			System.out.println("\nDeseja continuar? (S/N): ");
			continuar = leitura.next();
		}
	}

}
