package br.Fib.Ecommece;

public class FreteTransportadora extends Frete {

	private double valor;
	private int prazo;

	@Override
	public double calcularFrete(String cep) {
		// TODO Auto-generated method stub
		// return super.calcularFrete(cep);
		valor = 8;

		return valor;
	}

	@Override
	public int calculaPrazo(String cep) {
		// TODO Auto-generated method stub
		// return super.calculaPrazo();
		prazo = 12;
		return prazo;
	}

}
