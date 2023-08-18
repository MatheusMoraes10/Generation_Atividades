package plataforma.repository;

import plataforma.model.Pacote;

public interface PlataformaRepository {

	//CRUD Carrinho
	public void ComprarPacote(Pacote pacote);
	public void Carrinho();
	public void	RemoverItemCarrinho(int id);
	public void AtualizarQuantidade(int id);
	
}
