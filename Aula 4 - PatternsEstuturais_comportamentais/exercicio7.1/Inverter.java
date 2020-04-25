package exercicio7_1;

public class Inverter extends TransformadorDeTextos {

	@Override
	protected void transformar(String texto) {
		String invertido = "";
		for (int i = texto.length() - 1;  0 <= i; i--) {
			invertido += texto.charAt(i);
		}

		texto = invertido;
		System.out.println("Inversao do texto: " + invertido);	
	}
}