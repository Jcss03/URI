package Iniciante;
import java.text.DecimalFormat;
import java.util.*;


public class _1008_Salario {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = ler.nextInt();
		int horasTrabalhadas =  ler.nextInt();
		double valorHora = ler.nextDouble();
		
		double Salary = horasTrabalhadas * valorHora;
		
		DecimalFormat df = new DecimalFormat("0.00");

        String dx = df.format(Salary);
        
        System.out.println("NUMBER = " + numero + "\n" + "SALARY = U$ "+ dx);
        
		

	}

}
