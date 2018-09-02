package Iniciante;
import java.util.*;
public class _1018_Cédulas {
	private static int cont1 = 0;
	private static int cont2 = 0;
	private static int cont3 = 0;
	private static int cont4 = 0;
	private static int cont5 = 0;
	private static int cont6 = 0;
	private static int cont7 = 0;
	private static int aux;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int dinheiro = ler.nextInt();
		
		aux = dinheiro;
		
		// 100, 50, 20 , 10 ,5 ,2 ,1 
		
		while(dinheiro >= 100) {
			cont1 = cont1 + 1;
			dinheiro = dinheiro - 100;
		}
		
		while(dinheiro >= 50){
			cont2 = cont2 + 1;
			dinheiro = dinheiro - 50;
			
		}
		
		while(dinheiro >= 20) {
			cont3 = cont3 + 1;
			dinheiro = dinheiro - 20;
		}
		
		while(dinheiro >= 10){
			cont4 = cont4 + 1;
			dinheiro = dinheiro - 10;
			
		}
		
		while(dinheiro >= 5){
			cont5 = cont5 + 1;
			dinheiro = dinheiro - 5;
			
		}
		
		while(dinheiro >= 2) {
			cont6 = cont6 + 1;
			dinheiro = dinheiro - 2;
		}
		
		while(dinheiro >= 1){
			cont7 = cont7 + 1;
			dinheiro = dinheiro - 1;
			
		}
		
		System.out.println(aux +"\n"+
							cont1 + " nota(s) de R$ 100,00" + "\n"+
							cont2 + " nota(s) de R$ 50,00" + "\n" +
							cont3 + " nota(s) de R$ 20,00" + "\n"+
							cont4 + " nota(s) de R$ 10,00" + "\n"+
							cont5 + " nota(s) de R$ 5,00" + "\n"+
							cont6 + " nota(s) de R$ 2,00" + "\n"+
							cont7 + " nota(s) de R$ 1,00" + "\n");
		
		
	}

}
