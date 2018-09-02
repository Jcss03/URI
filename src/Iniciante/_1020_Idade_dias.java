package Iniciante;

import java.util.Scanner;

public class _1020_Idade_dias {
	private static int cont1 = 0;
	private static int cont2 = 0;


	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int dias = ler.nextInt();
		
		while(dias >= 365){
			cont1 += 1;
			dias = dias - 365;
		}
		
		while(dias >= 30){
			cont2 += 1;
			dias = dias - 30;	
		}
		
		System.out.println(cont1 +" ano(s)" + "\n" + 
						   cont2 + " mes(es)" + "\n" +
						   dias + " dia(s)");
		

	}

}
