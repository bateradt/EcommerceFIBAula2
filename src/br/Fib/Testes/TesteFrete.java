package br.Fib.Testes;

import br.Fib.Ecommece.FreteCorreios;
import br.Fib.Ecommece.FreteLoja;
import br.Fib.Ecommece.FreteTransportadora;

public class TesteFrete {

	public static void main(String[] args) {

		FreteCorreios frete = new FreteCorreios();
		frete.calcularFrete("00");
		System.out.println(frete.getValor());
		System.out.println(frete.getPrazo());

		FreteLoja frete1 = new FreteLoja();
		frete1.calcularFrete("12");
		System.out.println(frete1.getValor());
		System.out.println(frete1.getPrazo());

		FreteTransportadora frete2 = new FreteTransportadora();
		frete2.calcularFrete("55");
		System.out.println(frete2.getValor());
		System.out.println(frete2.getPrazo());

	}

}
