package plataforma.model;

public class PacoteInternacional extends Pacote {

	private String pais;
	private String moeda;
	
	public PacoteInternacional(int id, String local, int preco, String pais, String moeda) {
		super(id, local, preco);
		this.pais = pais;
		this.moeda = moeda;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	@Override
	public String local(String local) {
		
		if(this.getLocal() != this.getPais()) {
			local = " - " + this.getPais();
		}
		return local;
	}
	
	@Override
	public void saida() {
		System.out.println("\n\n***************************************************************");
		System.out.println("                     Pacote Internacional:                     ");
		System.out.println("***************************************************************");
		System.out.println("ID: " + getId());
		System.out.println("Local: " + getLocal());
		System.out.println("Preço: " + getPreco());
		System.out.println("Pais: " + this.pais);
		System.out.println("Moeda: " + this.moeda);
		
	}
	
}
