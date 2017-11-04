package br.Fib.Testes;

import br.Fib.Ecommece.FreteCorreios;
import br.Fib.Ecommece.FreteLoja;
import br.Fib.Ecommece.FreteTransportadora;

public class TesteFrete {

	public static void main(String[] args) {

		FreteCorreios frete = new FreteCorreios("11");
		System.out.println(frete.getValor());
		System.out.println(frete.getPrazo());
		System.out.println(frete.getTipo());

		FreteLoja frete1 = new FreteLoja("55");
		System.out.println(frete1.getValor());
		System.out.println(frete1.getPrazo());
		System.out.println(frete1.getTipo());

		FreteTransportadora frete2 = new FreteTransportadora("66");
		System.out.println(frete2.getValor());
		System.out.println(frete2.getPrazo());
		System.out.println(frete2.getTipo());

	}

}
