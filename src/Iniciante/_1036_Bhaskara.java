package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class _1036_Bhaskara {

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
		
		// 3 valores da equação
		double A = Double.parseDouble(Ateste);
		double B = Double.parseDouble(Bteste);
		double C = Double.parseDouble(Cteste);
		
		double delta = Math.pow(B, 2) - 4 * A * C;
		
		double eq1 = -B + Math.sqrt(delta);
		double eq2 = (-B) - Math.sqrt(delta);
		
		if(delta < 0 || eq1 == 0 || eq2 ==0) {
			System.out.println("Impossivel Calcular");
		} else {
		
		double R1 = eq1 / (2*A);
		double R2 = eq2 / (2*A);
		
		DecimalFormat df = new DecimalFormat("0.00000");

        String raiz1 = df.format(R1);
        String raiz2 = df.format(R2);
        
        System.out.println("R1 = " + raiz1 + "\n" + "R2 = " + raiz2);
		
		}
	}

}
