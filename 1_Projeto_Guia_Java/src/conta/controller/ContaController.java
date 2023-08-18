package conta.controller;

import java.util.ArrayList;

import conta.model.Carrinho;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Carrinho> listaContas = new ArrayList<Carrinho>();
	int numero = 0;
	
	@Override
	public void procutarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null)
			conta.visualizar();
		else
			System.out.println("\nA Conta número: " + numero + " não foi encontrada!");
	}
	
	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		var conta = buscarNaCollection(numero);
		
		if (conta != null)
			conta.visualizar();
		else
			System.out.println("A Conta número: "+numero+" não foi encontrada!");
		
	}

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		for (var conta : listaContas) {
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(Carrinho conta) {
		// TODO Auto-generated method stub
		listaContas.add(conta);
		System.out.println("\nA Conta número: "+ conta.getNumero() + " Foi criada com sucesso!");
	}

	@Override
	public void atualizar(Carrinho conta) {
		// TODO Auto-generated method stub
		var buscaConta = buscarNaCollection(conta.getNumero());
		
		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("\nA Conta numero: "+ conta.getNumero()+" foi atualizada com sucesso!");
		}else
			System.out.println("\n Conta numero: "+ conta.getNumero()+" não foi econtrada!");
		
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
				if (listaContas.remove(conta) == true)
					System.out.println("\n A conta numero: " +numero+ " foi deletada com sucesso!");
		}else
			System.out.println("\n A conta numero: "+numero+" não foi encontrada!");
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (conta.sacar(valor) == true)
				System.out.println("\nO Saque na conta numero: "+numero+" foi efetuado com sucesso!");
		}else 
			System.out.println("\nA Conta numero: "+numero+" não foi encontrada!");

		
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta!=null) {
			conta.depositar(valor);
			System.out.println("\nO depósito na conta numero: "+numero+" foi efetuado com sucesso!");
		}else 
			System.out.println("\n A Conta numero: "+numero+" não foi encontrada ou a Conta destino não é uma Conta Corrente!");
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			
			if(contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("\nA transferência foi efetuada com sucesso!");
			}
		}else
			System.out.println("\nA Conta de Origem e/ou Destino não foram encontradas!");
	}

	public int gerarNumero() {
		return ++ numero;
	}
	
	public Carrinho buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}
	
	public int retornaTipo(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
			return conta.getTipo();
			}
		}
		
		return 0;
	}
	
}
