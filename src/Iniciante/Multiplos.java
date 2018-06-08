package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplos {

	public static void main(String[] args) throws IOException {
		java.io.InputStream entrada = System.in;
		
		InputStreamReader ler = new InputStreamReader(entrada);
		BufferedReader dados = new BufferedReader(ler);
		
		String[] valores = dados.readLine().split(" ");
		
		String a = valores[0];
		String b = valores[1];
		
		
		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);
		
		if(A >= B) {
			if( (A % B) == 0) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao Multiplos");
			}
		}else{
			
			if((B % A) == 0) {
				System.out.println("Sao Multiplos");
			}else{
			System.out.println("Nao sao Multiplos");
			}
		}

	}

}
