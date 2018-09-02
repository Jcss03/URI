package Iniciante;

import java.util.Scanner;

public class _1004_ProdutoSimples {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int A = ler.nextInt();
		int B =  ler.nextInt();
		
		int PROD = A * B;
		
		System.out.println("PROD = " + PROD);

	}

}
