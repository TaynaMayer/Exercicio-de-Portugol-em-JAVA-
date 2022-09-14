package br.com.residencia.poo.primeiralista;

import java.util.Scanner;

public class NumeroDois {

	public static void main(String[] args) {

		int idade, tempoVida = 0;
		Scanner ler = new Scanner(System.in);

		for (int cont = 1; cont <= 6; cont++) {

			System.out.println("Qual é a idade do seu colega " + cont + "?");
			idade = ler.nextInt();
			tempoVida += idade;
		}

		System.out.println("Qual é a sua idade?");
		idade = ler.nextInt();

		tempoVida += idade;

		System.out.println("O tempo de vida sua e dos seus colegas é: " + tempoVida);

		ler.close();
	}

}
