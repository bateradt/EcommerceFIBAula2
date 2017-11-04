package br.Fib.Testes;

import br.Fib.Ecommece.Eletronicos;
import br.Fib.Ecommece.Livro;

public class TesteProdutos {

	public static void main(String[] args) {

		// Eletronicos chromecast = new Eletronicos("Google", "Streaming de
		// mídia", "110V",
		// "1 Chromecast; 1Cabo de alimentação;1Adaptador de energia", 12,
		// "NC2-6A5", "NC2-6A5");

		Eletronicos chromecast = new Eletronicos("ChromeCast 2", 199.50, "Teste", "1234567890124");

		chromecast.setConteudoEmbalagem("Teste de conteudo");
		chromecast.setFuncionalidade("Streaming de mídia");
		chromecast.setGarantiaFornecedorMeses(12);
		chromecast.setMarca("Google");

		System.out.println(chromecast.getDescricao());
		System.out.println(chromecast.getValor());

		Livro livro = new Livro("Livro - Livro Origem", 49.90, "Teste", "9788580417661");
		livro.setAno("2017");
		livro.setAssunto("Mistério");
		livro.setAutor("Dan Brown");
		livro.setEdicao("1ª Ed.");
		livro.setEditora("Arqueiro");
		livro.setIdioma("BR");
		livro.setISBN("9788580417661");

		System.out.println(livro.getDescricao());
		System.out.println(livro.getValor());

	}

}
