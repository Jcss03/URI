package Iniciante;
import java.util.*;

/*
 * 1 hora = 60 minutos
 * 1 minuto = 60 segundos
 * 1 hora = 3600 segundos
 */


public class Conversao_tempo{
	
	private static int cont1 = 0;
	private static int cont2 = 0;

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		int segundos = ler.nextInt();
		
		while(segundos >= 3600) {
			cont1 = cont1 + 1;
			segundos = segundos - 3600;
		}
		
		while(segundos >= 60){
			cont2 = cont2 + 1;
			segundos = segundos - 60;
			
		}
		
		
		System.out.println(cont1 + ":" + cont2 + ":" + segundos);
		

	}

}
