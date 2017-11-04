package br.Fib.Testes;

import java.text.NumberFormat;

import br.Fib.Ecommece.Carrinho;
import br.Fib.Ecommece.Eletronicos;
import br.Fib.Ecommece.FreteTransportadora;
import br.Fib.Ecommece.ItensCarrinho;
import br.Fib.Ecommece.Livro;

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

		Carrinho carrinho = new Carrinho();

		carrinho.adicionarProduto(livro, 1);

		// System.out.println("Total carrinho: R$ " + carrinho.getTotal());

		Eletronicos chromecast = new Eletronicos("ChromeCast 2", 199.50, "Teste", "1234567890124", 100.0);

		chromecast.setConteudoEmbalagem("Teste de conteudo");
		chromecast.setFuncionalidade("Streaming de mídia");
		chromecast.setGarantiaFornecedorMeses(12);
		chromecast.setMarca("Google");

		carrinho.adicionarProduto(chromecast, 3);

		// System.out.println("Total carrinho: R$ " + carrinho.getTotal());

		for (ItensCarrinho item : carrinho.getItens()) {
			System.out.println(item.getQtde() + " x - Item: " + item.getProduto().getDescricao() + " Valor R$: "
					+ item.getProduto().getValor() + " Tot.: " + item.getQtde() * item.getVlUnit() + "\n");
		}

		FreteTransportadora frete = new FreteTransportadora("16202040");
		System.out.println("Subtotal: " + carrinho.getTotal());

		System.out.println(" ------------------------------- \n");

		carrinho.removeProduto(chromecast, 1);

		for (ItensCarrinho item : carrinho.getItens()) {
			System.out.println(item.getQtde() + " x - Item: " + item.getProduto().getDescricao() + " Valor R$: "
					+ item.getProduto().getValor() + " Tot.: " + item.getQtde() * item.getVlUnit() + "\n");
		}

		System.out.println("Subtotal: " + carrinho.getTotal());
		System.out.println(" ------------------------------- \n");

		carrinho.removeProduto(livro, 1);

		for (ItensCarrinho item : carrinho.getItens()) {
			System.out.println(item.getQtde() + " x - Item: " + item.getProduto().getDescricao() + " Valor R$: "
					+ item.getProduto().getValor() + " Tot.: " + item.getQtde() * item.getVlUnit() + "\n");
		}

		System.out.println("Subtotal: " + carrinho.getTotal());

		carrinho.finalizar(frete);
		System.out.println("Frete: " + frete.getValor() + " /  " + frete.getTipo());
		System.out.println("Total Compra " + NumberFormat.getCurrencyInstance().format(carrinho.getTotal()));

		/*
		 * for (ItensCarrinho item : carrinho.getItens()) { System.out.println(
		 * "Item: " + item.getProduto().getDescricao() + " Valor R$: " +
		 * item.getProduto().getValor() + "\n"); }
		 */
		// System.out.println("Total carrinho: R$ " + carrinho.getTotal());

	}

}
