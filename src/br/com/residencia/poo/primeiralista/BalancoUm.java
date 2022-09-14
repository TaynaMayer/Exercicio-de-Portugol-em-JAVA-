package br.com.residencia.poo.primeiralista;

public class BalancoUm {

	int gastosJaneiro = 15000;
	int gastosFevereiro = 23000;
	int gastosMarco = 17000;
	int gastosAbril = 18000;
	int gastosMaio = 25000;
	int gastosJunho = 14000;
	int gastosJulho = 19000;
	int gastosAgosto = 20000;
	int gastosSetembro = 24000;
	int gastosOutubto = 13000;
	int gastosNovembro = 12000;
	int gastosDezembro = 22000;

	public int soma(int gastosJaneiro, int gastosFevereiro, int gastosMarco) {
		int somaTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		return somaTrimestre;
	}

	public int soma(int gastosJaneiro, int gastosFevereiro, int gastosMarco, int gastosAbril, int gastosMaio,
			int gastosJunho) {
		int somaSemestral = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosJunho;
		return somaSemestral;
	}

	public int soma(int gastosJaneiro, int gastosFevereiro, int gastosMarco, int gastosAbril, int gastosMaio,
			int gastosJunho, int gastosJulho, int gastosAgosto, int gastosSetembro, int gastosOutubro,
			int gastosNovembro, int gastosDezembro) {
		int somaAnual = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosJunho
				+ gastosJulho + gastosAgosto + gastosSetembro + gastosOutubro + gastosNovembro + gastosDezembro;
		return somaAnual;
	}

}
