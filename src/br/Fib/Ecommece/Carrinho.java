package br.Fib.Ecommece;

import java.util.ArrayList;
import java.util.List;

public class Carrinho{
	int qtde = 0;
	double total = 0;
	List<ItensCarrinho> itens = new ArrayList<ItensCarrinho>();
	//List<Produto> itens = new ArrayList<Produto>();
	
	public Carrinho() {
		itens = new ArrayList<ItensCarrinho>();
	}
	
	public void adicionarProduto(Produto produto, int qtde) {
		/*this.qtde += qtde;
		this.total += produto.getValor();
		this.itens.add(produto);*/
		
		this.qtde += qtde;
		this.total += produto.getValor();
		
		ItensCarrinho item = new ItensCarrinho();
		
		item.setProduto(produto);
		item.setQtde(qtde);
		item.setVlUnit(produto.getValor());
		item.setVlTotal(produto.getValor() * qtde);
		
		itens.add(item);
	}
	
	public void removeProduto(Produto produto) {
		
		this.itens.remove(produto);
		this.total -= produto.getValor();
	}
	
	public List<ItensCarrinho> listarItensCarrinho() {
		return this.itens;
	}
	
	public void limparCarrinho() {
		this.itens.clear();
	}
	
	public void finalizar(Frete frete) {
		total =+ frete.getValor();
	}

	public List<ItensCarrinho> getItens() {
		return itens;
	}

	public void setItens(List<ItensCarrinho> itens) {
		this.itens = itens;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
