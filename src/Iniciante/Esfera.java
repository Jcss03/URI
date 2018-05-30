package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Esfera {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double Raio = ler.nextDouble();
		
		double pi = 3.14159;
		double volume = (4/3.0) * pi * Math.pow(Raio,3);
		
		DecimalFormat df = new DecimalFormat("0.000");
		String dx = df.format(volume);
		
		System.out.println("VOLUME = " + dx);
		
	}

}
