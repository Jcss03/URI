package Iniciante;

import java.util.Scanner;

public class Numeros_Positivos {

	private static int positivo = 0;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		//1 inteiro
		double A = ler.nextDouble();
		//2 inteiro
		double B = ler.nextDouble();
		//3 inteiro
		double C = ler.nextDouble();
		// 4 inteiro
		double D = ler.nextDouble();
		// 5 inteiro
		double E = ler.nextDouble();
		//6 inteiro
		double F = ler.nextDouble();
		
		double [] dados = {A,B,C,D,E,F};
		
	
		for(int i = 0 ; i < dados.length; i++) {
			if(dados[i] > 0) {
				positivo = positivo + 1;
				}
		}
		
		System.out.println( positivo + " valores positivos");

	}

}
