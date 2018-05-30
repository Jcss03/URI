package Iniciante;

import java.util.Scanner;

public class Distancia {

	private static double afastamento = 0;
	private static int cont = 0;
	
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
					
		Scanner ler = new Scanner(System.in);
		int distancia = ler.nextInt();
	
		// cada iteração Y se afasta 1/2 km de X
		while(afastamento != distancia) {
			 
			cont += 1;
			
			afastamento += 0.5;
		}
		
		System.out.println(cont + " minutos");
		
		
	}

}
