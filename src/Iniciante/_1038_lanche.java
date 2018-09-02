package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class _1038_lanche {

	public static void main(String[] args) throws IOException {
		
		InputStream entrada = System.in;  // linha 1 da entrada
		
		InputStreamReader L1 = new InputStreamReader(entrada); //ler a linha 1
		
		BufferedReader Dados = new BufferedReader(L1); // Buffer com dados da primeira linha
		
		String[] valoresdigitados = Dados.readLine().split(" ");// pega os dados do buffer, separados por " " e armazena-os em um array
		
		String SA = valoresdigitados[0]; 
		String SB = valoresdigitados[1];
		
		 int codigo = Integer.parseInt(SA);
		 double qtd = Double.parseDouble(SB);
		 
		 
		 switch(codigo) {
		 case 1:
			 qtd = qtd*4; 
			 break;
		 case 2:
			 qtd = qtd*4.5;
			 break;
		 case 3:
			 qtd = qtd*5;
			 break;
		 case 4:
			  qtd = qtd*2;
			 break;
		 case 5:
			 qtd = qtd*1.5;
			 break;
		 }
		
		 DecimalFormat df = new DecimalFormat("0.00");
		 String dx = df.format(qtd);
		 
		 System.out.println("Total: R$ " + dx);
		 
	}

}
