package br.Fib.Ecommece;

public abstract class Produto {

	private String Descricao;
	private Double Valor;
	private String Informacoes;
	private String CodigoBarras;
	private Double Peso;

	public Produto(String descricao, Double valor, String informacoes, String codigoBarras, Double peso) {
		super();
		Descricao = descricao;
		Valor = valor;
		Informacoes = informacoes;
		CodigoBarras = codigoBarras;
		Peso = peso;
	}

	public String getDescricao() {
		return Descricao;
	}

	public Double getValor() {
		return Valor;
	}

	public String getInformacoes() {
		return Informacoes;
	}

	public String getCodigoBarras() {
		return CodigoBarras;
	}

	public Double getPeso() {
		return Peso;
	}

}
