package br.com.residencia.poo.primeiralista;

public class BalancoTrimestral {

	public static void main(String[] args) {

		BalancoUm calc = new BalancoUm();

		
		System.out.println("Balanço trimestral: " + calc.soma(calc.gastosJaneiro, calc.gastosFevereiro, calc.gastosMarco));
		
		System.out.println("Balanço Semestral: " + calc.soma(calc.gastosJaneiro, calc.gastosFevereiro, calc.gastosMarco,
				calc.gastosAbril, calc.gastosMaio, calc.gastosJunho));
		
		System.out.println("Balanço Anual: " + calc.soma(calc.gastosJaneiro, calc.gastosFevereiro, calc.gastosMarco,
				calc.gastosAbril, calc.gastosMaio, calc.gastosJunho, calc.gastosJulho, calc.gastosAgosto, calc.gastosSetembro, calc.gastosOutubto,
				calc.gastosNovembro, calc.gastosDezembro));
				
		
		
		
		
		
		

	}

}
