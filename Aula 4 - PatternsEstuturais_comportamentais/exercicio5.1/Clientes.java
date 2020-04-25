package exercicio5_1;


import java.io.Serializable;
public class Clientes implements Serializable
{

	private static final long serialVersionUID = 1L;
	String nome;
	int idade;
	long id;
	

	public Clientes(long id, String nome, int idade) 
	{
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() 
	{
		return "ID ---- " + id + ", Nome: " + nome + ", Idade: " + idade;
	}



}
