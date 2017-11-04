package br.Fib.Ecommece;

public abstract class Produto {

	public String Descricao;
	public Double Valor;
	public String Informacoes;
	public String CodigoBarras;
	public String Peso;
	public String Dimensoes;

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

	public String getPeso() {
		return Peso;
	}

	public void setPeso(String peso) {
		Peso = peso;
	}

	public String getDimensoes() {
		return Dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		Dimensoes = dimensoes;
	}

}
