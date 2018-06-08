package Iniciante;

import java.util.Scanner;

public class Soma_impares_consecutivos {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//1 inteiro
		int A = ler.nextInt();
		//2 inteiro
		int B = ler.nextInt();
		
		int maior,menor;
		int soma = 0;
		
		if(A >= B) {
			maior = A;
			menor = B;
		}else {
			maior = B;
			menor = A;
		}
		
		for(int i = menor+1 ; i < maior ; i++) {
			if((i%2) != 0) {
				soma = soma + i;
			}
			
		}
		
		System.out.println(soma);

	}

}
