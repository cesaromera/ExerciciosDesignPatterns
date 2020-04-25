package exercicio8_1_2;

public class Programa {

	public static void main(String[] args) 
		{

		ConsomeNoticia agregadorTopico = new AgregadorTopico("Games");
		ConsomeNoticia agregadorMensal = new AgregadorMensal();

		NoticiarioAssina noticiario = new NoticiarioAssina(agregadorTopico);
		noticiario.notificaNoticia("Concurso de game indie retorna na Brasil Game Show 2020", 16, 04, "Games");
		
		new Consumidor("Wyllis Silva", noticiario);
		noticiario.notificaNoticia("Valorant: Riot Games anuncia in�cio de beta fechado para o Brasil", 9, 04, "Games");

		new Consumidor("Marcus Fernandes", noticiario);
		noticiario.notificaNoticia("GDC 2020, confer�ncia de desenvolvedores de games, � adiada por causa do coronav�rus", 28, 02, "Games");
		
		new Consumidor("Cesar", noticiario);
		noticiario.notificaNoticia("Agrotins: em Tocantins, feira de tecnologia deve ser realizada de forma virtual", 17, 04, "T�cnologia");
	
		noticiario = new NoticiarioAssina(agregadorMensal);
		new Consumidor("Eliu Silva", noticiario);
		noticiario.notificaNoticia("falta de testes � desafio para ministro da saude", 18, 04, "Sa�de");
		
		}

}
