package plataforma;

import java.io.IOException;
import java.util.Scanner;

import plataforma.controller.PlataformaController;
import plataforma.model.PacoteInternacional;
import plataforma.model.PacoteNacional;

import plataforma.util.Cores;

public class Plataforma {

	public static void main(String[] args) {
		
		PlataformaController pacote = new PlataformaController();
		
		PacoteInternacional pci1 = new PacoteInternacional(1, "Las Vegas", 950, "Estados Unidos", "USD");
		PacoteNacional pcn1 = new PacoteNacional(2, "Sorocaba", 350, "São Paulo");
		PacoteInternacional pci2 = new PacoteInternacional(3, "Roma", 750, "Italia", "USD");
		PacoteNacional pcn2 = new PacoteNacional(4, "Porto Alegre", 550, "Rio Grande do Sul");
		
		int opcao = 0, cont = 0;
		String usuario = "", bandeiracartao = "";
		int cartao [] = new int [4];
		
		Scanner leitura = new Scanner(System.in);
		
		while (true) {
			
			//Menu
			
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
							+"**********************************************");
			System.out.println("                                              ");
			System.out.println("               Viage Fácil                    ");
			System.out.println("                                              ");
			System.out.println("**********************************************");
			System.out.println("                                              ");
			if (usuario != "") {
			System.out.println("        1 - Usuário: "+usuario                     );
			}else {
			System.out.println("        1 - Castrar usuário                       ");
			}
			if (cartao[0] != 0) {
			System.out.println("        2 - Cartão: "+bandeiracartao           );
			System.out.println(" com inicio:"+cartao[0]+cartao[1]+ " Cadastrado como forma de pagamento."                   );
			}else {
			System.out.println("	2 - Cadastrar cartão de crédito           ");
			}
			System.out.println("	3 - Comprar Pacotes de viagens            ");
			System.out.println("	4 - Carrinho de compras                   ");
			System.out.println("	5 - Remover item carinho de compras       ");
			System.out.println("	6 - Atualizar quantidade carrinho         ");
			System.out.println("	7 - Sobre a Viage Fácil                   ");
			System.out.println("	8 - Sair da plataforma                    ");
			System.out.println("                                              ");
			System.out.println("**********************************************");
			System.out.println("Entre com a opção desejada:                   ");
			System.out.println("                                              "+Cores.TEXT_RESET);
			
			opcao = leitura.nextInt();
			
			if (opcao == 8) {
				System.out.println("\nViage Fácil - Nunca foi tão fácil viajar");
				System.out.println();
				System.out.println("Plataforma Desenvolvido por: Matheus Moraes");
				System.out.println("Projeto Java de encerramento do módulo 1");
				leitura.close();
				System.exit(0);
			}
			
			switch (opcao) {
				
			// Cadastro usuario
			case 1 -> {
				if(usuario != "") {
					String op = "";
					System.out.println("Deseja Castrar um novo usuário? (S/N)");
					op = leitura.next();
					op = op.toUpperCase();
					
					if (op == "S") {
						System.out.println("Digite o Nome do usuário: ");
						usuario = leitura.next();
					}
				}
				if (usuario == "") {
				System.out.println("\n Criar usuário");
					
				System.out.println("Digite o Nome do usuário: ");
				usuario = leitura.next();
				}
				keyPress();
			}
			
			//Logica cadastro cartão
			case 2 -> {
				System.out.println("Cadastrar cartão de crédito\n\n");
				
				if(cartao [0] != 0) {
					String op = "";
					System.out.println("Deseja Castrar um novo cartão? (S/N)");
					op = leitura.next();
					op = op.toUpperCase();
					
					if (op == "S") {
						System.out.println("Digite os 4 primeiros numeros do cartão: ");
						for (cont=0;cont < 4;cont++) {
							System.out.println("Digite o "+(cont+1)+"° Dígito do cartão: ");
							cartao[cont] = leitura.nextInt();
						}
					}
					
					if (cartao[0] == 4) {
						bandeiracartao = "VISA";
						System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_BLACK_BACKGROUND+"Cartão Visa cadastrado com sucesso!"+Cores.TEXT_RESET);
					}else if (cartao[0] == 5 && cartao[1] == 1|| cartao[0] == 5 && cartao[1] ==  2||
							cartao[0] == 5 && cartao[1] == 3 || cartao[0] == 5 && cartao[1] == 4 ||
							cartao[0] == 5 && cartao[1] == 5) {
						bandeiracartao = "MASTERCARD";
						System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_BLACK_BACKGROUND+"Cartão Mastercard cadastrado com sucesso!"+Cores.TEXT_RESET);
					}else if (cartao[0] == 3 && cartao[1] == 4 || cartao[0] == 3 && cartao[1] == 7) {
						bandeiracartao = "AMERICAN EXPRESS";
						System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_BLACK_BACKGROUND+"Cartão American Express cadastrado com sucesso!"+Cores.TEXT_RESET);
					}else if (cartao[0] == 5 || cartao[0] == 6) {
						bandeiracartao = "ELO";
						System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_BLACK_BACKGROUND+"Cartão Elo cadastrado com sucesso!"+Cores.TEXT_RESET);
					}else {
						cartao[0] = 0;
						System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_BLACK_BACKGROUND+"Cartão de crédito inválido !!"+Cores.TEXT_RESET);
						System.out.println("Visa: começa com número 4");
						System.out.println("Mastercard: começa com números que vão de 51 a 55");
						System.out.println("Elo: começa com número 5 ou 6");
						System.out.println("American Express: começa com número 34 ou 37");
					}
				}else if (cartao[0] == 0) {
					System.out.println("\n Cadastrar cartão");
				
					System.out.println("Digite os 4 primeiros numeros do cartão: ");
					for (cont=0;cont < 4;cont++) {
					System.out.println("Digite o "+(cont+1)+"° Dígito do cartão: ");
					cartao[cont] = leitura.nextInt();
					
					}
				
				}
				
				if (cartao[0] == 4) {
					bandeiracartao = "VISA";
					System.out.println("Cartão Visa cadastrado com sucesso!");
				}else if (cartao[0] == 5 && cartao[1] == 1|| cartao[0] == 5 && cartao[1] ==  2||
						cartao[0] == 5 && cartao[1] == 3 || cartao[0] == 5 && cartao[1] == 4 ||
						cartao[0] == 5 && cartao[1] == 5) {
					bandeiracartao = "MASTERCARD";
					System.out.println("Cartão Mastercard cadastrado com sucesso!");
				}else if (cartao[0] == 3 && cartao[1] == 4 || cartao[0] == 3 && cartao[1] == 7) {
					bandeiracartao = "AMERICAN EXPRESS";
					System.out.println("Cartão American Express cadastrado com sucesso!");
				}else if (cartao[0] == 5 || cartao[0] == 6) {
					bandeiracartao = "ELO";
					System.out.println("Cartão Elo cadastrado com sucesso!");
				}else {
					cartao[0] = 0;
					System.out.println("Cartão de crédito inválido !!");
					System.out.println("Visa: começa com número 4");
					System.out.println("Mastercard: começa com números que vão de 51 a 55");
					System.out.println("Elo: começa com número 5 ou 6");
					System.out.println("American Express: começa com número 34 ou 37");
				}
				
				
				keyPress();
			}
			
			// Caomprar pacotes com chamada para o controller
			case 3 -> {
				var op = 0;
				System.out.println("Comprar Pacotes de viagens\n\n");
				pci1.saida();
				pcn1.saida();
				pci2.saida();
				pcn2.saida();
				System.out.println();
				System.out.println("Qual pacote deseja comprar ?" );
				op = leitura.nextInt();
				
				switch (op) {
				case 1 -> {
					pacote.ComprarPacote(new PacoteInternacional(1, "Las Vegas", 500, "Estados Unidos", "USD"));
				}
				case 2 -> {
					pacote.ComprarPacote(new PacoteNacional(2, "Sorocaba", 300, "São Paulo"));
				}
				case 3 -> {
					pacote.ComprarPacote(new PacoteInternacional(3, "Roma", 750, "Italia", "USD"));
				}
				case 4 -> {
					pacote.ComprarPacote(new PacoteNacional(4, "Porto Alegre", 550, "Rio Grande do Sul"));
				}
				default -> System.out.println("Pacote inexistente!");
				}
				keyPress();
			}
			
			//Exibir o carrinho
			
			case 4 -> {
				System.out.println("Carrinho de compras\n\n");
				pacote.Carrinho();
				keyPress();
			}
			
			//Remover item carrinho
			case 5 -> {
				System.out.println("Remover item carinho de compras\n\n");
				pacote.Carrinho();
				System.out.println();
				System.out.println("Qual ID do Item que deseja remover?: ");
				int id = leitura.nextInt();
				
				pacote.RemoverItemCarrinho(id);
				
				keyPress();
			}
			
			
			// Atualizar qauntidade carrinho *******Em desenvovimento**********
			case 6 -> {
				System.out.println("Atualizar quantidade carrinho\n\n");
				keyPress();
			}
			
			//Sobre o desenvolvedor 
			case 7 -> {
				System.out.println("Sobre a Viage Fácil\n\n");
				
				System.out.println("Plataforma Desenvolvido por: Matheus Moraes");
				System.out.println("Projeto Java de encerramento do módulo 1");
				
				keyPress();
			}
			
			//Finalizar loop while e sair do programa
			case 8 -> {
				System.out.println("Sair da plataforma\n\n");
				keyPress();
			}
			
			}
			
		}
		
		
}


public static void keyPress() {

	try {

		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
		System.in.read();

	} catch (IOException e) {

		System.out.println("Você pressionou uma tecla diferente de enter!");

	}
}
}
