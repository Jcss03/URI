package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioBonus {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args){
		
		Scanner ler = new Scanner(System.in);
		
		String nome = ler.nextLine();
		double salariofixo =  ler.nextDouble();
		double totalvenda = ler.nextDouble();
		
		double Total = salariofixo + (totalvenda*0.15);
		
		DecimalFormat df = new DecimalFormat("0.00");

        String dx = df.format(Total);
        
        System.out.println("Total = " + dx);
        
		

	}

}

