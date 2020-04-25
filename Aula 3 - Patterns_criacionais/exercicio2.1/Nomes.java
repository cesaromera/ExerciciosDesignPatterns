package exercicio2_1;

import java.util.List;
import java.util.ArrayList;

public class Nomes 
{
	List<Nome> nomes;

	public Nomes(String[] lista) {
		nomes = new ArrayList<>();
		processar(lista);
		imprimir();			
	}

	public void imprimir() {
		for(Nome nome:nomes) {
			System.out.println(nome);
		}
	}

	public void processar(String[] lista) {
		ArmazemNomes an = null;
		for(String item:lista) {
			if (item.indexOf(',') >= 0) {
				an = new NomesVirgulados(nomes);
			} else {
				an = new NomesDesvirgulados(nomes);
			}
			nomes = an.armazenar(item); 
		}
	}

}
