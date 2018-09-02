package Iniciante;

import java.io.*;
import java.text.DecimalFormat;

public class _1010_CalculoSimplesInteiros {
	
	//Run error time na submissao URI 

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		
		/*InputStream É uma classe abstrata que oferece a funcionalidade básica para a leitura de um byte 
		 * ou de uma sequência de bytes a partir de alguma fonte.*/
		
		InputStream entrada = System.in;  // linha 1 da entrada
		
		InputStreamReader P1 = new InputStreamReader(entrada);
		
		BufferedReader DadosP1 = new BufferedReader(P1); // Buffer com dados da primeira linha
		
		String[] digitado = DadosP1.readLine().split(" ");// pega os dados do buffer, separados por " " e armazena-os em um array
		
		String codigoP1 = digitado[0]; 
		String qtdP1 = digitado[1];
		String ValorP1 = digitado[2];
		
		ValorP1.replaceAll(",", "."); // troca a virgula por ponto para poder converter a string em double
		 
		 int quantidadePeçasP1 = Integer.parseInt(qtdP1); // converte string em inteiro
		 double ValorUnitarioP1 = Double.parseDouble(ValorP1); // converte string para double
		 
		 double Total1 = (quantidadePeçasP1 * ValorUnitarioP1);
		 
		 
		 InputStream entrada2 = System.in;  // linha 2 da entrada
			
			InputStreamReader P2 = new InputStreamReader(entrada2);
			
			BufferedReader DadosP2 = new BufferedReader(P2); // Buffer com dados da primeira linha
			
			String [] digitado2 = DadosP2.readLine().split(" ");// pega os dados do buffer, separados por " " e armazena-os em um array
			
			String codigoP2 = digitado2[0]; 
			String qtdP2 = digitado2[1];
			String ValorP2 = digitado2[2];
			
			ValorP2.replaceAll(",", "."); // troca a virgulo por ponto para poder converter a string em double
			 
			 int quantidadePeçasP2 = Integer.parseInt(qtdP2); // converte string em inteiro
			 double ValorUnitarioP2 = Double.parseDouble(ValorP2); // converte string para double
			 
			 double Total2= (quantidadePeçasP2 * ValorUnitarioP2);
			
			 double Total = Total1 + Total2;
				
			 DecimalFormat df = new DecimalFormat("0.00");
			 String dx = df.format(Total);
	        
	         System.out.println("VALOR A PAGAR: = R$ "+ dx);
		
		
	}

}



