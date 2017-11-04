package br.Fib.Testes;

import br.Fib.Ecommece.Carrinho;
import br.Fib.Ecommece.Eletronicos;
import br.Fib.Ecommece.FreteTransportadora;
import br.Fib.Ecommece.Livro;
import br.Fib.Ecommece.Produto;

public class TesteCarrinho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro = new Livro("Livro - Livro Origem", 49.90, "Teste", "9788580417661", 150.0);
		livro.setAno("2017");
		livro.setAssunto("Mistério");
		livro.setAutor("Dan Brown");
		livro.setEdicao("1ª Ed.");
		livro.setEditora("Arqueiro");
		livro.setIdioma("BR");
		livro.setISBN("9788580417661");
		
		Carrinho carrinho  = new Carrinho();
		carrinho.adicionarProduto(livro);
		
		System.out.println("Total carrinho: R$ " + carrinho.getTotal());
		
		Eletronicos chromecast = new Eletronicos("ChromeCast 2", 199.50, "Teste", "1234567890124", 100.0);

		chromecast.setConteudoEmbalagem("Teste de conteudo");
		chromecast.setFuncionalidade("Streaming de mídia");
		chromecast.setGarantiaFornecedorMeses(12);
		chromecast.setMarca("Google");
		
		carrinho.adicionarProduto(chromecast);
		
		System.out.println("Total carrinho: R$ " + carrinho.getTotal());
		
		for(Produto item : carrinho.getItens()) {
			System.out.println("Item: " + item.getDescricao() + " Valor R$: " + item.getValor() + "\n");
		}
		
		FreteTransportadora frete = new FreteTransportadora();
		frete.calcularFrete("16202040");
		
		carrinho.finalizar(frete);
		
		System.out.println("Frete: " + frete.toString());
		System.out.println("Total Compra R$ " + carrinho.getTotal());
		
		for(Produto item : carrinho.getItens()) {
			System.out.println("Item: " + item.getDescricao() + " Valor R$: " + item.getValor() + "\n");
		}
	}

}
