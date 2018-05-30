package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double A = ler.nextDouble();
		double B =  ler.nextDouble();
		double C = ler.nextDouble();
		
		double Media = ((A * 2) + (B * 3) + (C * 5)) / 10;
		
		DecimalFormat df = new DecimalFormat("0.0");

        String dx = df.format(Media);
		
		System.out.println("MEDIA = " + dx);

	}

}
