package br.Fib.Ecommece;

public class FreteCorreios extends Frete {

	public FreteCorreios(String cep) {
		super(cep);
		this.setValor(15);
		this.setPrazo(5);
		this.setTipo(TipoFreteEnum.CORREIOS);
	}
	/*
	 * @Override public void calcularFrete(String cep) { this.setValor(15);
	 * this.setPrazo(5); }
	 */
}
