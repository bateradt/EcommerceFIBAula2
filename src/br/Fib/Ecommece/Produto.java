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

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}

	public String getInformacoes() {
		return Informacoes;
	}

	public void setInformacoes(String informacoes) {
		Informacoes = informacoes;
	}

	public String getCodigoBarras() {
		return CodigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		CodigoBarras = codigoBarras;
	}

	public Double getPeso() {
		return Peso;
	}

	public void setPeso(Double peso) {
		Peso = peso;
	}

}
