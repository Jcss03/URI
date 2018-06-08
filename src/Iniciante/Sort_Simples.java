package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Sort_Simples {
	
	
	public static void main(String[] args) throws IOException {
		
		InputStream entrada = System.in;
		
		InputStreamReader ler = new InputStreamReader(entrada);
		BufferedReader dados = new BufferedReader(ler);
		
		String[] valores = dados.readLine().split(" ");
		
		String a = valores[0];
		String b = valores[1];
		String c = valores[2];
		
		
		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);
		int C = Integer.parseInt(c);
		
		if( A > B && A > C){
			//maior é A
			if(B > C) {
				System.out.println(C + "\n" + B + "\n" + A + "\n\n" + A + "\n" + B + "\n" + C);
			}else {
				System.out.println(B + "\n" + C + "\n" + A + "\n\n" + A + "\n" + B + "\n" + C);
			}
			
			
			
		}else if(B > C){
			//maior eh B
			if(A > C){
				System.out.println(C + "\n" + A + "\n" + B + "\n\n" + A + "\n" + B + "\n" + C);
			}else{
				System.out.println(A + "\n" + C + "\n" + B + "\n\n" + A + "\n" + B + "\n" + C);
			}
			
			
			
		}else {
			//maior C
			if(A > B){
				System.out.println(B + "\n" + A + "\n" + C + "\n\n" + A + "\n" + B + "\n" + C);
			}else{
				System.out.println(A + "\n" + B + "\n" + C + "\n\n" + A + "\n" + B + "\n" + C);
			}
		}
		
	}

}
