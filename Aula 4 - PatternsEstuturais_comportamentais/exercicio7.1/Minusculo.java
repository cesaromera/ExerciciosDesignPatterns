package exercicio7_1;

public class Minusculo extends TransformadorDeTextos {

	@Override
	protected void transformar(String texto) {
		System.out.println("Transformacao para minusculo: " + texto.toLowerCase());
	}
}