package br.Fib.Ecommece;

public class FreteTransportadora extends Frete {

	@Override
	public void calcularFrete(String cep) {
		this.setValor(8);
		this.setPrazo(12);
	}

}
