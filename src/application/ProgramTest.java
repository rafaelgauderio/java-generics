package application;

import servicos.ServicoImpressao;

public class ProgramTest {

	public static void main(String[] args) {

		
		System.out.println("Generics\n"
				+ "Generics permitem que classes, interfaces e métodos possar ser parametrizados por um tipo genérico.\n"
				+ "Entre as vantagens temos o reuso (não repetição de código), type safety e performance.\n");
		
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
		System.out.println("O penúltimo valor informado foi: " + y);
		
		System.out.println("\nInforme um lista de valores do tipo String");
		ServicoImpressao <String> siString = new ServicoImpressao<String>();
		
		siString.adicinarValor("Rafael");
		siString.adicinarValor("Cláudia");
		siString.adicinarValor("Laura");
		siString.adicinarValor("Laura");
		siString.adicinarValor("Otávio");
		siString.adicinarValor("Zilda");
		
		siString.imprimir();
		System.out.println("Primeiro valor da lista do tipo String: " + siString.primeiroValor());
		System.out.println("Penúltimo valor da lista do tipo String: " + siString.penultimoValor());
		
		
		

	}

}
