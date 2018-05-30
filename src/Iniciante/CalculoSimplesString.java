package Iniciante;
import java.text.DecimalFormat;
import java.util.*;

//Teste
// 12 1 5.30
//16 2 5.10

public class CalculoSimplesString {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		
		 Scanner ler = new Scanner(System.in);
		
		 String DadosP1  = ler.nextLine(); // dados da primeira linha
		
		 String[] arrayValores = DadosP1.split(" "); // pega os dados separados por " " e armazena-os em um array
		 
		 String codigoP1 = arrayValores[0];
		 String qtdP1 = arrayValores[1];
		 String ValorP1 = arrayValores[2];
		
		 ValorP1.replaceAll(",", "."); // troca a virgulo por ponto para poder converter a string em double
		 
		 int quantidadePeçasP1 = Integer.parseInt(qtdP1); // converte string em inteiro
		 double ValorUnitarioP1 = Double.parseDouble(ValorP1); // converte string para double
		 
		 double Total1 = (quantidadePeçasP1 * ValorUnitarioP1);
	
	     String DadosP2  = ler.nextLine(); // dados da segunda linha
			
		 String[] arrayValoresP2 = DadosP2.split(" "); // pega os dados separados por " " e armazena-os em um array
		 
		 String codigoP2 = arrayValoresP2[0];
		 String qtdP2 = arrayValoresP2[1];
		 String ValorP2 = arrayValoresP2[2];
		
		 ValorP2.replaceAll(",", "."); // troca a virgulo por ponto para poder converter a string em double
		 
		 
		 int quantidadePeçasP2 = Integer.parseInt(qtdP2); // converte string em inteiro
		 double ValorUnitarioP2 = Double.parseDouble(ValorP2); // converte string para double
		 
		 double Total2 = (quantidadePeçasP2 * ValorUnitarioP2);
		 
		 
		 double Total = Total1 + Total2;
		
		 DecimalFormat df = new DecimalFormat("0.00");
		 String dx = df.format(Total);
        
         System.out.println("VALOR A PAGAR: = R$ "+ dx);
        
	}

}
