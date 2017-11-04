package br.Fib.Ecommece;

public class FreteCorreios extends Frete {

	private double valor;
	private int prazo;

	@Override
	public double calcularFrete(String cep) {
		// TODO Auto-generated method stub
		// return super.calcularFrete(cep);

		valor = 15;
		return valor;
	}

	@Override
	public int calculaPrazo(String cep) {
		// TODO Auto-generated method stub
		// return super.calculaPrazo();
		prazo = 5;
		return prazo;
	}

}
