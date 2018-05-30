package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//Incompleto

public class Maior {

	@SuppressWarnings("unused")
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

	}

}
