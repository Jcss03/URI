package Iniciante;

import java.util.Scanner;

public class Seis_impares {
	
	private static int count = 0;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int A = ler.nextInt();
		
		while (count != 6) {
			
			if((A%2) != 0) {
				System.out.println(A+2);
				A = A + 2;
				count = count + 1;
			}else {
				System.out.println(A+1);
				A = A + 1;
				count = count + 1;
			}
			
		}

	}

}
