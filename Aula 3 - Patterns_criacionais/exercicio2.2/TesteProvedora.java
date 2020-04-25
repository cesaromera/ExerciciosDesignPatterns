package exercicio2_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class TesteProvedora {

	public static void main(String[] args) {
		criarArquivos();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		new Factory(sc.nextLine());
		sc.close();
	}
	private static void criarArquivos() {
		try (PrintWriter writer = new PrintWriter(new File("publico.txt"))) {
			writer.println("Estas informacoes sao publicas");
		} catch (FileNotFoundException e) {
			System.out.println("Deu erro ao escrever o arquivo");
			e.printStackTrace();
		}
		try (PrintWriter writer = new PrintWriter(new File("confidencial.txt"))) {
			writer.println("Estas informacoes sao confidenciais");
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao escrever o segundo arquivo");
			e.printStackTrace();
		}
	}
}