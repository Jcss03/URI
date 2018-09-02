package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//Falta submeter ao URI

public class _1013_Maior {

	public static void main(String[] args) throws IOException {
		
		InputStream entrada = System.in;  // linha 1 da entrada
		
		InputStreamReader ler = new InputStreamReader(entrada);
		
		BufferedReader Dados = new BufferedReader(ler); // Buffer com dados da primeira linha
		
		String[] digitado = Dados.readLine().split(" ");
		
		String Ateste = digitado[0]; 
		String Bteste = digitado[1];
		String Cteste = digitado[2];
		
		Ateste.replaceAll(",", ".");
		Bteste.replaceAll(",", ".");
		Cteste.replaceAll(",", ".");
		
		double A = Double.parseDouble(Ateste);
		double B = Double.parseDouble(Bteste);
		double C = Double.parseDouble(Cteste);
		
		
		
		double maiorAB = (A + B + Math.abs(A - B))/2; 
		double maior = maiorAB;
		
		
		if(maiorAB < C) {
			maior =  C;
		}
		
		
		System.out.println(maior + " eh o maior");
		
		
		/*double maior = A;
		
		if( maior < B) {
			maior = B;
		}
		if (maior < C) {
			maior = C;	
		}
		
		System.out.println("eh o maior: " + maior);*/
	
	}

}
