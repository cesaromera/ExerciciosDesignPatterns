package exercicio1_1;

import java.util.Random;

public class ImpressaoTeste {

	public static void main(String[] args) {

		ImpOutput imprime = new ImpOutput();
		ImpTela imprime2  = new ImpTela();

		Random gerador = new Random(); 
		int x = gerador.nextInt();

		switch (x%2){
		case 0:		
			imprime.escreve();
			break;

		case 1:
			imprime2.escreve();
		}
	}
}