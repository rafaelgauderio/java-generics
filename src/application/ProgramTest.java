package application;

import servicos.ServicoImpressao;

public class ProgramTest {

	public static void main(String[] args) {

		
		System.out.println("Generics\n"
				+ "Generics permitem que classes, interfaces e m�todos possar ser parametrizados por um tipo gen�rico.\n"
				+ "Entre as vantagens temos o reuso (n�o repeti��o de c�digo), type safety e performance.\n");
		
		System.out.println("\nInforme um lista de valores inteiros");
		ServicoImpressao<Integer> si = new ServicoImpressao<Integer>();
		
		si.adicinarValor(8);
		si.adicinarValor(12);
		si.adicinarValor(7);
		si.adicinarValor(92);
		si.adicinarValor(17);
		si.adicinarValor(35);

		// imprimir a lista
		si.imprimir();
		Integer x = si.primeiroValor();
		Integer y = si.penultimoValor();
		System.out.println("Primeiro valor informado foi: " + x);
		System.out.println("O pen�ltimo valor informado foi: " + y);
		
		System.out.println("\nInforme um lista de valores do tipo String");
		ServicoImpressao <String> siString = new ServicoImpressao<String>();
		
		siString.adicinarValor("Rafael");
		siString.adicinarValor("Cl�udia");
		siString.adicinarValor("Laura");
		siString.adicinarValor("Laura");
		siString.adicinarValor("Ot�vio");
		siString.adicinarValor("Zilda");
		
		siString.imprimir();
		System.out.println("Primeiro valor da lista do tipo String: " + siString.primeiroValor());
		System.out.println("Pen�ltimo valor da lista do tipo String: " + siString.penultimoValor());
		
		
		

	}

}
