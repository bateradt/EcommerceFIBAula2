package br.Fib.Ecommece;

public class Eletronicos extends Produto {

	public Eletronicos(String descricao, Double valor, String informacoes, String codigoBarras) {
		super(descricao, valor, informacoes, codigoBarras);
	}

	private String marca;
	private String funcionalidade;
	private String voltagem;
	private String conteudoEmbalagem;
	private int garantiaFornecedorMeses;
	private String modelo;
	private String referenciaModelo;
	private Double peso;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFuncionalidade() {
		return funcionalidade;
	}

	public void setFuncionalidade(String funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

	public String getConteudoEmbalagem() {
		return conteudoEmbalagem;
	}

	public void setConteudoEmbalagem(String conteudoEmbalagem) {
		this.conteudoEmbalagem = conteudoEmbalagem;
	}

	public int getGarantiaFornecedorMeses() {
		return garantiaFornecedorMeses;
	}

	public void setGarantiaFornecedorMeses(int garantiaFornecedorMeses) {
		this.garantiaFornecedorMeses = garantiaFornecedorMeses;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getReferenciaModelo() {
		return referenciaModelo;
	}

	public void setReferenciaModelo(String referenciaModelo) {
		this.referenciaModelo = referenciaModelo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

}
