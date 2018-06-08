package Iniciante;

import java.util.Scanner;

public class Pares_entre5_numeros {
	private static int par = 0;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		//1 inteiro
		int A = ler.nextInt();
		//2 inteiro
		int B = ler.nextInt();
		//3 inteiro
		int C = ler.nextInt();
		// 4 inteiro
		int D = ler.nextInt();
		// 5 inteiro
		int E = ler.nextInt();
		
		int [] dados = {A,B,C,D,E};
		
		for(int i = 0 ; i < dados.length; i++) {
			
			if((dados[i]%2) == 0)
				par = par + 1;
		
		}
	
		System.out.println(par + " valores pares");

	}

}
