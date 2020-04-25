package exercicio7_1;

public class Maiusculo extends TransformadorDeTextos {

	@Override
	protected void transformar(String texto) {
		System.out.println("Transformacao para maiusculo: " + texto.toUpperCase());
	}
}