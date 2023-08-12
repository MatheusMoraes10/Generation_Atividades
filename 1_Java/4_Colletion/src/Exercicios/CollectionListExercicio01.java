package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionListExercicio01 {

	public static void main(String[] args) {
		
		//Integer no collection é equivalente ao inteiro
		//Array Lista não precisa definir o tamanho
		
		int cont;
		String cor = "";
		
		Scanner leitura = new Scanner(System.in);
		
		//Criação da lista para receber as cores
		List<String> listaCores = new ArrayList<String>();
		
		
		//Usando o for para ir adicionando 5 cores que o susuário digitar
		for(cont=0;cont<5;cont++) {
			System.out.println("Digite a "+(cont+1)+"° Cor: ");
			cor = leitura.nextLine();
			listaCores.add(cor);
		}
		
		// For para percorrer o Collection list e imprimir um a baixo do outro
		// O println vazio abaixo é para dar um espaço
		
		System.out.println("As cores digitadas foram: ");
		System.out.println("");
		
		
		for(cont=0;cont<5;cont++) {
			System.out.println(listaCores.get(cont));
		}
		
		System.out.println("");
		
		System.out.println("Ordenando a Lista: ");
		System.out.println("");
		
		//Comando ordena a lista
		
		Collections.sort(listaCores);
		
		for(cont=0;cont<5;cont++) {
			System.out.println(listaCores.get(cont));
		}
		//System.out.println(listaCores);
	}

}
