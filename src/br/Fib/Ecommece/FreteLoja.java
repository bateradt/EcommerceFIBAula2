package br.Fib.Ecommece;

public class FreteLoja extends Frete {

	private double valor;
	private int prazo;

	@Override
	public double calcularFrete(String cep) {
		// TODO Auto-generated method stub
		// return super.calcularFrete(cep);
		valor = 0;
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
