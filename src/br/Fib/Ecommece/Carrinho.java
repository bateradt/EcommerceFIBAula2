package br.Fib.Ecommece;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	double total = 0;
	List<Produto> itens = new ArrayList<Produto>();
	
	public void adicionarProduto(Produto produto) {
		//this.total += produto.getValor();
		this.itens.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		this.itens.remove(produto);
		//this.total += produto.getValor();
	}
	
	public void finalizar() {
		
	}
}
