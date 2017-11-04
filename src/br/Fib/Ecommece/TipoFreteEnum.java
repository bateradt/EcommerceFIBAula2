package br.Fib.Ecommece;

public enum TipoFreteEnum {

	LOJA(1), CORREIOS(2), TRANSPORTADORA(3);

	private int tipoFrete;

	private TipoFreteEnum(int tipoFrete) {
		this.tipoFrete = tipoFrete;
	}

	public int getTipoFrete() {
		return tipoFrete;
	}

}
