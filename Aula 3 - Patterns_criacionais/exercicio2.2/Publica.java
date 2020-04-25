package exercicio2_2;

public class Publica implements Provedora{

	@Override	
	public String proverInfo() {
		return lerArquivo("Arquivo publico.txt");
	}
}