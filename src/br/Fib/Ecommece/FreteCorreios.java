package br.Fib.Ecommece;

public class FreteCorreios extends Frete {

	@Override
	public void calcularFrete(String cep) {
		this.setValor(15);
		this.setPrazo(5);
	}

}
