package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1005_Media1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double A = ler.nextDouble();
		double B =  ler.nextDouble();
		
		double Media = ((A * 3.5) + (B * 7.5)) / 11;
		
		DecimalFormat df = new DecimalFormat("0.00000");

        String dx = df.format(Media);
		
		System.out.println("MEDIA = " + dx);
	}

}
