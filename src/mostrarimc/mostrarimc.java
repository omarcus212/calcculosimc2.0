package mostrarimc;

import java.util.Scanner;

import mostrarimc.ContaDoImc;
public class mostrarimc {
	
	public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
		ContaDoImc calculos = new ContaDoImc();
		


		String querdnv = "s";
		
		
		 while(querdnv.equals("s") || querdnv.equals("S")) {
		System.out.print("Digite sua altura : ");
		calculos.multiplicador();
		
		System.out.print("Digite seu pessinho : ");
		calculos.dividir();
		
		if(calculos.resultado<=18.5) {
			System.out.println("VOC� ESTA ABAIXO DO PESO, ***TEM QUE COMER MAIS McDonald�s!***");
		}else if(calculos.resultado>=18.6 && calculos.resultado<=24.9) {
			System.out.println("VOC� ESTA NO PESSINHO IDEIAL, ***CONGRATULATION***, MAS TAMB�M SO TA BASICO N�?!");
		}else if(calculos.resultado>=25.0 && calculos.resultado<=29.9) {
			System.out.println("VOC� ESTA COM SOBREPESO, ***TA COM A BARRIGINHA SALIENTE EEEMMM*** ");
		}else if(calculos.resultado>=30 && calculos.resultado<=34.9) {
			System.out.println("VOC� ESTA COM OBESIDADE GRAU 1, ***POH VAMOS COMER MAIS LEGUMES, E PRATICAR UM BASQUETIZINHO*** ");
		}else if(calculos.resultado>=35 && calculos.resultado<=39.9) {
			System.out.println("VOC� ESTA COM OBESIDADE GRAU 2, ***MEUUUUUUU DEUUUUUUSSS DOIDOOOO,CHEGA DE McDonald�s PARA VOC�***");
		}else {
			System.out.println("VOC� ESTA COM OBESIDADE GRAU 3,PROCURE UM ESPECIALISTA IMEDIATAMENTE,***OBESIDADE N�O � BRINCADEIRA***");
		}
		     
		System.out.println("quer calcular outro imc? (s),(n) : ");
		querdnv = leitor.next();
	
		 }
		  System.out.println("obrigado! at� mais");
		leitor.close();
		
		
	}

}
