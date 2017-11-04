package br.Fib.Ecommece;

public class FreteCorreios extends Frete {

	// private double valor;
	// private int prazo;

	@Override
	public void calcularFrete(String cep) {
		this.setValor(15);
		this.setPrazo(5);
		// return valor;
	}

}
