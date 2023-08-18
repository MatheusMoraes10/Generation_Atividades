package plataforma.controller;

import java.util.ArrayList;

import plataforma.model.Pacote;
import plataforma.repository.PlataformaRepository;

public class PlataformaController implements PlataformaRepository {

	private ArrayList<Pacote> listaCarrinho = new ArrayList<Pacote>();
	
	int numero = 0;
	
	@Override
	public void ComprarPacote(Pacote pacote) {
		listaCarrinho.add(pacote);
		System.out.println("O pacote foi adicionado ao carrinho!");
	}

	@Override
	public void Carrinho() {
		for (var pacote : listaCarrinho) {
			pacote.saida();
		}
		
	}

	@Override
	public void RemoverItemCarrinho(int id) {
		var pacote = buscarCarrinho(id);
		
		if (pacote != null) {
			if(listaCarrinho.remove(pacote) == true) {
				System.out.println("O pacote foi deletado do carrinho!");
			}else {
				System.out.println("O pacote não foi encontrado no carrinho!");
			}
		}
	}

	@Override
	public void AtualizarQuantidade(int id) {
		// TODO Auto-generated method stub
		
	}

	public Object buscarCarrinho(int id) {
		for (var pacote : listaCarrinho) {
			if (pacote.getId() == id) {
				return pacote;
			}
		}
		return null;
	}
	
	
}
