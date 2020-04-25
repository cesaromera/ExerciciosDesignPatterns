package exercicio2_3;

public class DirConsole extends Direcionador
{

	int i =0;
	@Override
	public void criarLog() {		
		for(i = 0; i<=10;i++) {
			System.out.println(i);
		}
	}
}