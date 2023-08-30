package Exercicios;

import java.util.Scanner;

public class SwitchExercicio01 {

	public static void main(String[] args) {
		int op;
		float qtd, valortotal = 0;
		
		System.out.println("Código do Produto | Produto         | Preço Unitário");
		System.out.println("____________________________________________________");
		System.out.println("1                 | Cachorro Quente | R$ 10.00");
		System.out.println("2                 | X-Salada        | R$ 15.00");
		System.out.println("3                 | X-Bacon         | R$ 18.00");
		System.out.println("4                 | Bauru           | R$ 12.00");
		System.out.println("5                 | Refrigerante    | R$ 8.00");
		System.out.println("6                 | Suco de laranja | R$ 13.00");
		System.out.println("");
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código do Produto: ");
		op = leia.nextInt();
		System.out.println("Quantidade: ");
		qtd = leia.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			valortotal = qtd * 10;
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			valortotal = qtd * 15;
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			valortotal = qtd * 18;
			break;
		case 4:
			System.out.println("Produto: Bauru");
			valortotal = qtd * 12;
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			valortotal = qtd * 8;
			break;
		case 6:
			System.out.println("Produto: Suco de laranja");
			valortotal = qtd * 13;
			break;
		}
		
		System.out.println("Valor total: R$ "+valortotal);
	}

}
