package Exercicios;

import java.util.Scanner;

public class SwitchExercicio02 {

	public static void main(String[] args) {
		int op;
		float salario;
		String colaborador;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código do Cargo | Cargo          | Percentual do Reajuste");
		System.out.println("1               | Gerente        | 10%");
		System.out.println("2               | Vendedor       | 7%");
		System.out.println("3               | Supervisor     | 9%");
		System.out.println("4               | Motorista      | 6%");
		System.out.println("5               | Estoquista     | 5%");
		System.out.println("6               | Técnico de TI  | 8%");
		System.out.println("");
		
		System.out.println("Nome do colaborador: ");
		colaborador = leia.nextLine();
		System.out.println("Cargo: ");
		op = leia.nextInt();
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		
		switch (op) {
		case 1:
			System.out.println("Nome colaborador : "+colaborador);
			System.out.println("Cargo: Gerente");
			salario = (float) (salario * 1.10);
			System.out.println("Salário: "+salario);
			break;
		case 2:
			System.out.println("Nome colaborador : "+colaborador);
			System.out.println("Cargo: Vendedor");
			salario = (float) (salario * 1.07);
			System.out.println("Salário: "+salario);
			break;
		case 3:
			System.out.println("Nome colaborador : "+colaborador);
			System.out.println("Cargo: Supervisor");
			salario = (float) (salario * 1.09);
			System.out.println("Salário: "+salario);
			break;
		case 4:
			System.out.println("Nome colaborador : "+colaborador);
			System.out.println("Cargo: Motorista");
			salario = (float) (salario * 1.06);
			System.out.println("Salário: "+salario);
			break;
		case 5:
			System.out.println("Nome colaborador : "+colaborador);
			System.out.println("Cargo: Estoquista");
			salario = (float) (salario * 1.05);
			System.out.println("Salário: "+salario);
			break;
		case 6:
			System.out.println("Nome colaborador : "+colaborador);
			System.out.println("Cargo: Técnico de TI");
			salario = (float) (salario * 1.08);
			System.out.println("Salário: "+salario);
			break;
		}
		
	}

}