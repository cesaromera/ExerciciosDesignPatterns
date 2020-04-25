package exercicio2_3;


public class Factory 
{

	public Direcionador gerarArq(String arq) 
	{
		if(arq.equals("Arquivo")) {
			Direcionador dr = new DirecionadorTXT();
			dr.criarLog();
		}
		else if(arq.equals("Console")) {
			Direcionador dc = new DirConsole();
			dc.criarLog();
		}

		return null;
	}

}