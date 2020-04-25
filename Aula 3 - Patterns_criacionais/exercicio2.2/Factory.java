package exercicio2_2;


public class Factory 
{

	public Factory(String senha) 
	{
		Provedora p;
		if (senha.equals("designpatterns")) 
	{
			p = new Confidencial();
		}else {
			p = new Publica();
		} 
		System.out.println(p.proverInfo());
	} 
}