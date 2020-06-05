package entities;

public abstract class Pessoa {
	private String nome;
	protected Double rendaAnual;

	public Pessoa() {

	}

	public Pessoa(String nome, Double rendaAnualDouble) {
		this.nome = nome;
		this.rendaAnual = rendaAnualDouble;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnualDouble() {
		return rendaAnual;
	}

	public void setRendaAnualDouble(Double rendaAnualDouble) {
		this.rendaAnual = rendaAnualDouble;
	}

	public abstract Double taxaPaga();

	public String toString() {
		return nome + ": $ " + String.format("%.2f", taxaPaga());
	}

}
