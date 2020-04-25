package exercico1_1;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class ImpOutput extends Impressao 

{


	public void escreve() {
		String content = "HELLO WOLRD!";
		String local = "C:\\Users\\Public\\output.txt";

		try {


			Files.write(Paths.get(local), content.getBytes());


		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}