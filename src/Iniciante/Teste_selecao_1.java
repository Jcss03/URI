package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Teste_selecao_1 {

	public static void main(String[] args) throws IOException {
		
		InputStream entrada = System.in;  // linha 1 da entrada
		
		InputStreamReader L1 = new InputStreamReader(entrada); //ler a linha 1
		
		BufferedReader Dados = new BufferedReader(L1); // Buffer com dados da primeira linha
		
		String[] valoresdigitados = Dados.readLine().split(" ");// pega os dados do buffer, separados por " " e armazena-os em um array
		
		String SA = valoresdigitados[0]; 
		String SB = valoresdigitados[1];
		String SC = valoresdigitados[2];
		String SD = valoresdigitados[3];
		
		 int A = Integer.parseInt(SA);
		 int B = Integer.parseInt(SB);
		 int C = Integer.parseInt(SC);
		 int D = Integer.parseInt(SD);
		 
		 if(B > C && D > A && (C + D) > (A + B) && C >= 0 && D >= 0 && (A % 2) == 0  ) {
			 System.out.println("Valores aceitos");
		 }else {
			 
			 System.out.println("Valores nao aceitos");
		 }
		
	}

}


/*A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, 
ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos",
senão escrever "Valores nao aceitos".*/
