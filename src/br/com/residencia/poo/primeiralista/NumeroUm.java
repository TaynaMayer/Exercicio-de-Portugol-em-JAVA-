package br.com.residencia.poo.primeiralista;

import java.util.Scanner;

public class NumeroUm {

	public static void main(String[] args) {

		String nome, sobrenome;
		Scanner ler = new Scanner(System.in);

		System.out.println("Qual é o seu nome?");
		nome = ler.nextLine();
		System.out.println("E o seu sobrenome?");
		sobrenome = ler.nextLine();

		System.out.println("Olá:" + nome + " " + sobrenome + "," + "seja bem-vindo ao universo da programação.");

		ler.close();
	}

}
