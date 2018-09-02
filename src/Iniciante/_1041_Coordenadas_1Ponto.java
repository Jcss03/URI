package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _1041_Coordenadas_1Ponto {

	public static void main(String[] args) throws IOException {
		
		InputStream entrada = System.in;
		
		InputStreamReader ler = new InputStreamReader(entrada);
		BufferedReader dados = new BufferedReader(ler);
		
		String[] valores = dados.readLine().split(" ");
		
		String a = valores[0];
		String b = valores[1];
		
		
		double X = Double.parseDouble(a);
		double Y = Double.parseDouble(b);
		
		//Origem
		if (X == 0 && Y == 0) {
			System.out.println("Origem");
		}
		
		if(X == 0 && (Y > 0 || Y < 0)) {
			System.out.println("Eixo Y");
		}
		if(Y == 0 && (X > 0 || X < 0)) {
			System.out.println("Eixo X");
		}
		
		//1 quadrante = + +
	
		if(X > 0 && Y > 0){
			System.out.println("Q1");
		}
		//2 quadrante = - +
		
		if(X < 0 && Y > 0){
			System.out.println("Q2");
		}
		//3 quadrante = - -
		
		if(X < 0 && Y < 0){
			System.out.println("Q3");
		}
		//4 quadrante = + -
		
		if (X > 0 && Y < 0){
			System.out.println("Q4");
		}
		

	}

}