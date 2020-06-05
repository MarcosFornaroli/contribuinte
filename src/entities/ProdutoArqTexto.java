package entities;

public class ProdutoArqTexto {
	private String produto;
	private Double peso;
	private Double valor;

	public ProdutoArqTexto() {
	}

	public ProdutoArqTexto(String produto, Double peso, Double valor) {
		this.produto = produto;
		this.peso = peso;
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double valorTotal() {
		return valor * peso;
	}
}
