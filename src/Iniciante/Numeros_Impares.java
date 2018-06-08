package Iniciante;

import java.util.Scanner;

public class Numeros_Impares {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int entrada = ler.nextInt();
		
		for(int i = 1 ; i <= entrada;i++) {
			if((i%2) != 0) {
				System.out.println(i);
			}
			
		}

	}

}
