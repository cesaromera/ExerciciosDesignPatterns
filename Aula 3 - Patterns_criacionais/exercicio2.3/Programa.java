package exercicio2_3;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
	
		String test = JOptionPane.showInputDialog("Digite para testar >arquivo ou console<: ");
		DirecionadorFactory df = new DirecionadorFactory();
		df.gerarArq(test);
	}
}