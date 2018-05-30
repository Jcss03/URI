package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class área {
	

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
		
		// a) Area do triangulo retangulo A = Base, C = Altura
		double Triangulo = ( A * C ) / 2;
		
		//b) Area do circulo com raio C (pi = 3,14159)
		double pi = 3.14159;
		double Circulo = pi *(C * C);
		
		//c) a área do trapézio que tem A e B por bases e C por altura. 
		double Trapezio = ( (A + B) * C ) / 2;
		
		//d) a área do quadrado que tem lado B. 
		double Quadrado = B * B;
		
		//e) a área do retângulo que tem lados A e B. 
		double Retangulo = A * B;
		
		 DecimalFormat df = new DecimalFormat("0.000");
		 String T = df.format(Triangulo);
		 String Ci = df.format(Circulo);
		 String TR = df.format(Trapezio);
		 String Q = df.format(Quadrado);
		 String R = df.format(Retangulo);
		
		
		System.out.println("TRIANGULO: " + T + "\n" +
							"CIRCULO: " + Ci + "\n" + 
							"TRAPEZIO: " + TR + "\n" + 
							"QUADRADO: " + Q + "\n" + 
							"RETANGULO: " + R); 
	}

}


/*TRIANGULO: 7.800
CIRCULO: 84.949
TRAPEZIO: 18.200
QUADRADO: 16.000
RETANGULO: 12.000*/
