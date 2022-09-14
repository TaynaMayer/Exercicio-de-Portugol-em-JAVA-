package br.com.residencia.poo.primeiralista;

import java.util.Scanner;

public class NumeroTres {

	public static void main(String[] args) {

		int numero1, numero2, multiplicacao, soma, subtracao;
		double divisao;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro número");
		numero1 = ler.nextInt();
		System.out.println("Digite o segundo número");
		numero2 = ler.nextInt();

		soma = (numero1 + numero2);
		subtracao = (numero1 - numero2);
		multiplicacao = (numero1 * numero2);

		System.out.println(
				"Soma: " + soma + "\n" + "Subtração: " + subtracao + "\n" + "Multiplicação: " + multiplicacao + "\n");

		divisao = (double) numero1 / numero2;
		if (numero2 != 0) {
			System.out.println("Divisão:" + divisao);
		} else {
			System.out.println("Divisão: Não é possível dividir por zero.");		}

		ler.close();
	}

}
