package Exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSetExercicio01 {

	public static void main(String[] args) {
		
		int cont, numdig;
		
		Scanner leitura = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();

		for(cont=0;cont<10;cont++) {
			
			System.out.println("Digite o "+(cont+1)+"° número: ");
			
			numdig = leitura.nextInt();
			
			numeros.add(numdig);
		}
		
		System.out.println();
		System.out.println("Set "+numeros);
		
		Iterator<Integer> inumeros = numeros.iterator();
		
		System.out.println();
		System.out.println("Listar dados do Set: ");
		System.out.println();

		//Estrutura para Impressão dos números na collection Set
		while(inumeros.hasNext()) {
			
		System.out.println(inumeros.next());
		
		}
	}

}
