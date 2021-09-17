package mostrarimc;

import java.util.Scanner;

import calculaimc.calculaimc;

public class mostrarimc {
	
	public static void main(String[] args) {
		
	Scanner leitor = new Scanner ( System.in);
	calculaimc calcularimc = new calculaimc();
	   
	double seupeso=0,suaaltura=0;
	  
	System.out.println("seu peso");
	seupeso = leitor.nextInt();
	
	System.out.println("sua altura");
	suaaltura = leitor.nextInt();
	
	
	calcularimc.multiplica();
	calcularimc.dividir();
	
	System.out.println();
	
	 
		
		
		
	}

}
