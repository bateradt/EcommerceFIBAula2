package br.Fib.Ecommece;

public class FreteLoja extends Frete {

	private double valor;
	private int prazo;

	@Override
	public void calcularFrete(String cep) {
		this.setValor(0);
		this.setPrazo(12);
	}

}
