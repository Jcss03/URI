package Iniciante;

import java.util.Scanner;

public class Pares_Impares_Pos_Neg {
	
	private static int par = 0;
	private static int impar = 0;
	private static int positivo = 0;
	private static int negativo = 0;
	
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
			
			if((dados[i]%2) == 0) {
				par = par + 1;
			}else {
				impar = impar + 1;
			}
			
			if(dados[i] > 0) {
				positivo = positivo + 1;
				
			}else if(dados[i] < 0){
				negativo = negativo + 1;
				
			}
			
			
		}
		
		System.out.println(par + " valor(es) par(es)" + "\n" + 
						   impar + " valor(es) impar(es)" + "\n" +
						   positivo + " valor(es) positivo(s)" + "\n" +
						   negativo + " valor(es) negativo(s)");

	}

}
