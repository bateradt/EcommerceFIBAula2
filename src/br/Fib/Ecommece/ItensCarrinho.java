package br.Fib.Ecommece;

public class ItensCarrinho {
	private Produto produto;
	private int qtde;
	private double vlUnit;
	private double vlTotal;
	
	public ItensCarrinho(Produto produto, int qtde, double vlUnit, double vlTotal) {
		super();
		this.produto = produto;
		this.qtde = qtde;
		this.vlUnit = vlUnit;
		this.vlTotal = vlTotal;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public int getQtde() {
		return qtde;
	}
	
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	public double getVlUnit() {
		return vlUnit;
	}
	
	public void setVlUnit(double vlUnit) {
		this.vlUnit = vlUnit;
	}
	
	public double getVlTotal() {
		return vlTotal;
	}
	
	public void setVlTotal(double vlTotal) {
		this.vlTotal = vlTotal;
	}
}
