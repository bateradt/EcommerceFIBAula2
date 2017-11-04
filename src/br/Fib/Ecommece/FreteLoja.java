package br.Fib.Ecommece;

public class FreteLoja extends Frete {

	public FreteLoja(String cep) {
		super(cep);
		this.setValor(0);
		this.setPrazo(12);
		this.setTipo(TipoFreteEnum.LOJA);
	}

	/*
	 * @Override public void calcularFrete(String cep) { super(cep);
	 * this.setValor(0); this.setPrazo(12); }
	 */

}
