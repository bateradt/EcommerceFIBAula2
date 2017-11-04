package br.Fib.Ecommece;

public class FreteMotoboy extends Frete {

	public FreteMotoboy(String cep) {
		super(cep);
		this.setPrazo(1);
		this.setTipo(TipoFreteEnum.MOTOBOY);
		this.setValor(5);

	}

}
