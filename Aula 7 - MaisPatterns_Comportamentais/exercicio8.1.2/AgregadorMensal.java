package exercicio8_1_2;

import java.util.ArrayList;
import java.util.List;



public class AgregadorMensal implements ConsomeNoticia 
{
	int mesCorrente = 0;
	List<Noticia> noticias = new ArrayList<>();

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) 
	{
		Noticia n = new Noticia(textoNoticia, dia, mes, topico);
		if (mesCorrente == 0) {
			mesCorrente = mes;
			noticias.add(n);
		} else {
			if(mesCorrente == mes) 
		{
				noticias.add(n);
			} else {
				System.out.println("Mudança de mes, noticias: ");
				for (Noticia noticia : noticias) {
					System.out.println(noticia);
				}
				noticias.clear();
				mesCorrente = mes;
				noticias.add(n);
			}
		}

	}

}
