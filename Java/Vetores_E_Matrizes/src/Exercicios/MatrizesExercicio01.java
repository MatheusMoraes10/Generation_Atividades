package Exercicios;

public class MatrizesExercicio01 {

	public static void main(String[] args) {
		
		int [][] matriz = new int [3][3];
		int linha, coluna;
		
		matriz [0][0] = 1;
		matriz [1][0] = 4;
		matriz [2][0] = 7;
		matriz [0][1] = 2;
		matriz [1][1] = 5;
		matriz [2][1] = 8;
		matriz [0][2] = 3;
		matriz [1][2] = 6;
		matriz [2][2] = 9;
		
		//Sistema impressão matriz
		
		System.out.print("Matriz");
		
		for(linha=0;linha<3;linha++) {
			System.out.print("\n");
			for(coluna=0;coluna<3;coluna++) {
				System.out.print("|"+matriz [linha][coluna]+"|");
			}
		}
		
		// impressão elementos na diagonal
		System.out.println("Elementos da Diagonal Principal: ");
		if()
		
	}

}
