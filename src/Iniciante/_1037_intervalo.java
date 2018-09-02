package Iniciante;

import java.util.Scanner;

public class _1037_intervalo {

	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		double entrada = ler.nextDouble();
		
		if(entrada >= 0 && entrada <= 25){
			System.out.println("Intervalo [0,25]");
				
		}else if(entrada > 25 && entrada <= 50) {
			System.out.println("Intervalo (25,50]");
		
		}else if(entrada > 50 && entrada <= 75) {
			System.out.println("Intervalo (50,75]");
		
		}else if(entrada > 75 && entrada <= 100) {
			System.out.println("Intervalo (75,100]");
		
		}else {
			
			System.out.println("Fora de intervalo");
		}
	
	
	
	}
}




/*
 * O símbolo ( representa "maior que". Por exemplo:
 
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

* [0,25]  == indica valores de 0 a 25
*, (25,50] == indica valores maiores que 25 e iguais a 50 
*  (50,75], == valores maiores que 50 ate 75
*  (75,100] maiores que 75 até 100
*
*/