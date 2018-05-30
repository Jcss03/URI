package Iniciante;
import java.util.Scanner;
public class SomaSimples {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int A = ler.nextInt();
		int B = ler.nextInt(); 
		
		int SOMA = A + B;
		System.out.println("SOMA = " + SOMA);

	}

}
