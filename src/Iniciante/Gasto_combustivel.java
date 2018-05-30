package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Gasto_combustivel {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int tempo = ler.nextInt();
		int velocidadeMedia = ler.nextInt();
		
		
		double distanciaPercorrida = tempo * velocidadeMedia;
		
		double Litros = distanciaPercorrida / 12;
		
		DecimalFormat df = new DecimalFormat("0.000");
		String dx = df.format(Litros);
		
		System.out.println(dx);
		
		
		
	}

}
