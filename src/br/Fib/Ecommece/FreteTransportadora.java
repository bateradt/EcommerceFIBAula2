package br.Fib.Ecommece;

public class FreteTransportadora extends Frete {

	public FreteTransportadora(String cep) {
		super(cep);
		this.setValor(8);
		this.setPrazo(12);
		this.setTipo(TipoFreteEnum.TRANSPORTADORA);
	}

	/*
	 * @Override public void calcularFrete(String cep) { this.setValor(8);
	 * this.setPrazo(12); }
	 */

}
