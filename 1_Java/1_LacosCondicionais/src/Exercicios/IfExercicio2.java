package Exercicios;

import java.util.Scanner;

public class IfExercicio2 {

	public static void main(String[] args) {
		int v1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		v1 = leia.nextInt();
		if (v1 > 0) {
		if(v1 % 2 == 0) {
			System.out.println("O Número "+v1+" é par e positivo!");
		}else {
			System.out.println("O Número "+v1+" é ímpar e positivo!");
		}
		}
		if (v1 < 0) {
		if(v1 % 2 == 0) {
			System.out.println("O Número "+v1+" é par e negativo!");
		}else {
			System.out.println("O Número "+v1+" é ímpar e negativo!");
		}
		}
	}

}
