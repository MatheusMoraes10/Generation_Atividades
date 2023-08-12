package Exercicios;

public class MatrizesExercicio01 {

	public static void main(String[] args) {
		
		int [][] matriz = new int [3][3];
		int linha, coluna, somaprinc = 0, somasec = 0;
		int [] diagprincipal = new int [3], diagsecundaria = new int [3];

		
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
		
		System.out.println();
		// impressão elementos na diagonal
		
		for(linha=0;linha<3;linha++) {
			
				for(coluna=0;coluna<3;coluna++) {
				
					if (linha == coluna) {
						diagprincipal[linha] = matriz [linha][coluna];
						somaprinc += diagprincipal[linha];
					}
					if (linha + coluna == 2) {
						diagsecundaria[linha] = matriz [linha][coluna];
						somasec += diagsecundaria[linha];
					}
				}
				
			}
		System.out.println("Elementos da Diagonal Principal: ");
		for(linha=0;linha<3;linha++) {
			System.out.print(diagprincipal[linha]+" ");
		}
		System.out.println();
		System.out.println("Elementos da Diagonal Secundária: ");
		for(linha=0;linha<3;linha++) {
			System.out.print(diagsecundaria[linha]+" ");
		}
		System.out.println();
		System.out.println("Soma dos Elementos da Diagonal Principal: ");
		System.out.println(somaprinc);
		System.out.println("Soma dos Elementos da Diagonal Secundária: ");
		System.out.println(somasec);
	}
	
		
}

