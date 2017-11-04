package br.Fib.Ecommece;

public abstract class Produto {

	private String descricao;
	private Double valor;
	private String informacoes;
	private String codigoBarras;

	public Produto(String descricao, Double valor, String informacoes, String codigoBarras) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.informacoes = informacoes;
		this.codigoBarras = codigoBarras;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

}
