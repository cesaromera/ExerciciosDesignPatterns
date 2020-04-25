package exercicio2_1;

import java.util.List;

public class NomesDesvirgulados extends ArmazemNomes 
{

	public NomesDesvirgulados(List<Nome> nomes) {
		super(nomes);
	}

	@Override
	protected CriadorDeNomes getCriador() {
		return new CriadorDeNomesDesvirgulados();
	}

}
