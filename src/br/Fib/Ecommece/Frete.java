package br.Fib.Ecommece;

public abstract class Frete {

	private double valor;
	private int prazo;
	private TipoFreteEnum tipo;

	public Frete(String cep) {
		valor = 0;
		prazo = 0;
	}

	public double getValor() {
		return valor;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public TipoFreteEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoFreteEnum tipo) {
		this.tipo = tipo;
	}

}
