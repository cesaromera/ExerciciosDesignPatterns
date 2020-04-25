package exercicio5_1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Teste 
{
	public static void main(String[] args) 
	{
		escreverObjeto();
		IOFacade ioFacade = new IOFacade();
		System.out.println(ioFacade.abrirTexto("teste.txt"));
		System.out.print("Arquivo bin�rio (bytes lidos): ");
		for (byte b : ioFacade.abrirBinario("teste.txt")) {
			System.out.print(b + " ");
		};
		System.out.println("\nArquivo com objeto: " + ioFacade.abrirObjeto("cliente.obj"));

	}

	private static void escreverObjeto() {
		Clientes cliente = new Clientes(1, "Wyllis", 23);
		try {
			FileOutputStream fileOut = new FileOutputStream("cliente.obj");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(cliente);
			objectOut.close();
		} catch (Exception ex) {
			System.out.println("Nao foi poss�vel escrever o objeto.");
			ex.printStackTrace();
		}
	}
}
