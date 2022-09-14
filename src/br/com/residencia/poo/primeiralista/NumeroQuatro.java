package br.com.residencia.poo.primeiralista;

import java.util.Scanner;

public class NumeroQuatro {

	public static void main(String[] args) {

		double F, C;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a temperatura em Celsius:");
		C = ler.nextDouble();

		F = (C * 1.8 + 32);

		System.out.println("Temperatura em °F: " + F + "°");

		ler.close();
	}

}
