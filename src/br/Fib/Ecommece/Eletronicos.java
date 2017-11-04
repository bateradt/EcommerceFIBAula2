package br.Fib.Ecommece;

public class Eletronicos extends Produto {

	public Eletronicos(String descricao, Double valor, String informacoes, String codigoBarras, Double peso) {
		super(descricao, valor, informacoes, codigoBarras, peso);
		// TODO Auto-generated constructor stub
	}

	private String Marca;
	private String Funcionalidade;
	private String Voltagem;
	private String ConteudoEmbalagem;
	private int GarantiaFornecedorMeses;
	private String Modelo;
	private String ReferenciaModelo;

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getFuncionalidade() {
		return Funcionalidade;
	}

	public void setFuncionalidade(String funcionalidade) {
		Funcionalidade = funcionalidade;
	}

	public String getVoltagem() {
		return Voltagem;
	}

	public void setVoltagem(String voltagem) {
		Voltagem = voltagem;
	}

	public String getConteudoEmbalagem() {
		return ConteudoEmbalagem;
	}

	public void setConteudoEmbalagem(String conteudoEmbalagem) {
		ConteudoEmbalagem = conteudoEmbalagem;
	}

	public int getGarantiaFornecedorMeses() {
		return GarantiaFornecedorMeses;
	}

	public void setGarantiaFornecedorMeses(int garantiaFornecedorMeses) {
		GarantiaFornecedorMeses = garantiaFornecedorMeses;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getReferenciaModelo() {
		return ReferenciaModelo;
	}

	public void setReferenciaModelo(String referenciaModelo) {
		ReferenciaModelo = referenciaModelo;
	}

}
