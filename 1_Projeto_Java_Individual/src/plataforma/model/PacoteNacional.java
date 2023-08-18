package plataforma.model;

public class PacoteNacional extends Pacote{

	private String cidade;
	
	public PacoteNacional(int id, String local, int preco, String cidade) {
		super(id, local, preco);
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String local(String local) {
		
		if(this.getLocal() != this.getCidade()) {
			local = " - " + this.getCidade();
		}
		return local;
	}
	
	@Override
	public void saida() {
		
		System.out.println("\n\n***************************************************************");
		System.out.println("                     Pacote Nacional:                     ");
		System.out.println("***************************************************************");
		System.out.println("ID: " + getId());
		System.out.println("Local: " + getLocal());
		System.out.println("Preço: " + getPreco());
		System.out.println("Pais: " + this.cidade);
		
	}
	
}
