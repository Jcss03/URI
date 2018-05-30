package Iniciante;

import java.util.Scanner;

public class Soma {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int A = ler.nextInt();
		System.out.println("Digite outro numero: ");
		int B = ler.nextInt();
		
		int X = A + B;
		
		System.out.println("X = " + X + "\n");
	}

}
