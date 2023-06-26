package application;

import java.util.Scanner;

import servicos.ServicoImpressao;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ServicoImpressao<Integer> si = new ServicoImpressao<Integer>();

		System.out.print("Quantos valores deseja imprimir?");
		int number = sc.nextInt();
		System.out.println("Agora informe os valores");

		for (int i = 0; i < number; i++) {
			Integer valor = sc.nextInt();
			si.adicinarValor(valor);
		}
		// imprimir a lista
		si.imprimir();
		Integer x = si.primeiroValor();
		Integer y=si.penultimoValor();
		System.out.println("Primeiro valor informado foi: " + x);
		System.out.println("O penúltimo valor informado foi: "+y);

		sc.close();

	}

}
