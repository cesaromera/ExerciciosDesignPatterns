package exercicio9_1;



public class Slot100 implements Slot
{

	private Slot slot;
	
	public Slot100() {
	};
	
	@Override
	public double recebeMoeda(int moeda) {
		if (moeda == 100) {
			System.out.println("-- Recebeu  R$1,00");
			return 1;
		}else {
			return this.slot.recebeMoeda(moeda);
		}	
	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
		
	}

}
