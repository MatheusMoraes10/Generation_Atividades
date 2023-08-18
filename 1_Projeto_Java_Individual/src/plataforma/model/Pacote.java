package plataforma.model;

public abstract class Pacote {

	private int id;
	private String local;
	private int preco;
	
	public Pacote(int id, String local, int preco) {
		this.id = id;
		this.local = local;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String local(String local) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saida() {
		
		
	}
	
}
	


