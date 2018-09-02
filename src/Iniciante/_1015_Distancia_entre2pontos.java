package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


// Run error time


public class _1015_Distancia_entre2pontos {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		
		InputStream entrada = System.in;  // linha 1 da entrada
		
		InputStreamReader ler = new InputStreamReader(entrada);
		
		BufferedReader Dados = new BufferedReader(ler); // Buffer com dados da primeira linha
		
		String[] digitado = Dados.readLine().split(" ");
		
		String Ateste = digitado[0]; 
		String Bteste = digitado[1];
		
		
		Ateste.replaceAll(",", ".");
		Bteste.replaceAll(",", ".");
		
		
		double x1 = Double.parseDouble(Ateste);
		double y1 = Double.parseDouble(Bteste);
		
		
		InputStream entrada2 = System.in;  // linha 2 da entrada
		
		InputStreamReader ler2 = new InputStreamReader(entrada2);
		
		BufferedReader Dados2 = new BufferedReader(ler2); // Buffer com dados da segunda linha
		
		String[] digitado2 = Dados2.readLine().split(" ");
		
		String Ateste2 = digitado2[0]; 
		String Bteste2 = digitado2[1];
		
		
		Ateste.replaceAll(",", ".");
		Bteste.replaceAll(",", ".");
		
		
		double x2 = Double.parseDouble(Ateste2);
		double y2 = Double.parseDouble(Bteste2);
		
		//Distancia = raiz (A2 - A1)^2 + (B2 - B1)^2
		
		double Distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		DecimalFormat df = new DecimalFormat("0.0000");
		String D = df.format(Distancia);
		
		System.out.println(D); 
		

	}

}
