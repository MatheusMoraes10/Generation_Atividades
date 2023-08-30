package Exercicios;

import java.util.Scanner;

public class IfExercicio01 {

	public static void main(String[] args) {
		int v1, v2, v3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor A:");
		v1 = leia.nextInt();
		System.out.println("Digite o valor B:");
		v2 = leia.nextInt();
		System.out.println("Digite o valor C:");
		v3 = leia.nextInt();
		
		if ((v1 + v2) > v3) {
			System.out.println(v1+" + "+v2+" = "+(v1+v2)+" > "+v3);
			System.out.println("A Soma de A + B é Maior do que C");
		}else if ((v1 + v2) < v3) {
			System.out.println(v1+" + "+v2+" = "+(v1+v2)+" < "+v3);
			System.out.println("A Soma de A + B é Menor do que C");
		}else {
			System.out.println(v1+" + "+v2+" = "+(v1+v2)+" = "+v3);
			System.out.println("A Soma de A + B é Igual a C");
		}
		
	}

}
