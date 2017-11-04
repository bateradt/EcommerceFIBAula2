package br.Fib.Ecommece;

public abstract class Frete implements FreteInterface {

	private double valor;
	private int prazo;

	public void calcularFrete(String cep) {

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

}
