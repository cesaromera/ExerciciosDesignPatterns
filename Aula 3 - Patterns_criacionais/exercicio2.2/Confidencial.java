package exercicio2_2;


public class Confidencial implements Provedora 
{

	@Override
	public String proverInfo() 
	{
		return lerArquivo("Informacao confidencial.txt");
	}
}
