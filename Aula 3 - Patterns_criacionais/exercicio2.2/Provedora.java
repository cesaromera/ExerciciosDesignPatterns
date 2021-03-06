package exercicio2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public interface Provedora {
	default String lerArquivo(String arquivo) 
	{
		StringBuilder sb = new StringBuilder();
		try (Scanner scanner = new Scanner(new File(arquivo))){
			while (scanner.hasNext()) {
				sb.append(scanner.nextLine());
			}
		}	catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado");
		}
		return sb.toString();

	}

	String proverInfo();
}