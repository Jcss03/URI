package Iniciante;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaCircunferencia {
	
	final static double n =  3.14159;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double raio = ler.nextDouble();
		
		
		double area = n * (raio * raio);
				
		double A = area;
		
		 DecimalFormat df = new DecimalFormat("0.0000");

         String dx = df.format(A);
		
		System.out.println("A=" + dx);

	}

}
