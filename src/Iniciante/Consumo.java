package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

// Presentension error

public class Consumo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int X = ler.nextInt();
		double Y = ler.nextDouble();
		
		double consumo = X / Y;
		
		DecimalFormat df = new DecimalFormat("0.000");
		String dx = df.format(consumo);
		
		System.out.println(dx +" "+"Km/l");
		
	}

}
