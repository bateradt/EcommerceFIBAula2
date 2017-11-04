package br.Fib.Ecommece;

public class FreteLoja extends Frete {

	@Override
	public void calcularFrete(String cep) {
		this.setValor(0);
		this.setPrazo(12);
	}

}
