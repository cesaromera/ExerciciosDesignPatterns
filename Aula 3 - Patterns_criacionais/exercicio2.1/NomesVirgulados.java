package exercicio2_1;

import java.util.List;

public class NomesVirgulados extends ArmazemNomes 
{

	public NomesVirgulados(List<Nome> nomes) {
		super(nomes);
	}

	@Override
	protected CriadorDeNomes getCriador() {
		return new CriadorDeNomesVirgulados();
	}

}
