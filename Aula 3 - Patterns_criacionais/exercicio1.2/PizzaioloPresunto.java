package exercicio1_2;


public class PizzaioloPresunto implements Pizzaiolo
{

	@Override
	public Pizza criarPizza() 
	{
		return new PizzaPresunto();
	}

	@Override
	public Calzone criarCalzone() 
	{
		return new CalzonePresunto();
	}
}