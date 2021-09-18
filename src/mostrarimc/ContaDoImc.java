package mostrarimc;

import java.util.Scanner;

public class ContaDoImc {


	
	        public double pesoo,altura,resultado,resultado2;
	        Scanner leitor = new Scanner(System.in);
	
	        
	        public void multiplicador() {
		    altura = leitor.nextDouble();
		    resultado2=altura*2;
		    System.out.println(+resultado2);
		   
	      }
	
	        public void dividir() {
		    pesoo = leitor.nextDouble();
		    resultado=pesoo/resultado2;
		    System.out.println(resultado);

	      } 
		
		
	
	 
	
	
}
