package conversorMoedas;

import javax.swing.JOptionPane;

public class Funcao {
	ConverterMoedas moedas = new ConverterMoedas();

	public void ConverterMoedas(double valorRecebido) {
		String opcao = (JOptionPane.showInputDialog(null,
				"Escolha a moeda para a qual você deseja converter seu dinheiro", "Moedas", JOptionPane.PLAIN_MESSAGE,
				null,
				new Object[] { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras",
						"De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais",
						"De Euros a Reais", "De Libra a Reais", "De Peso Argentino a Reais",
						"De Peso Chileno a Reais" },
				"Escolha")).toString();
		switch (opcao) {
		case "De Reais a Dolares":
			moedas.ConverterReaisADolar(valorRecebido);
			break;
		case "De Reais a Euro":
			moedas.ConverterReaisAEuro(valorRecebido);
			break;
		case "De Reais a Libra":
			moedas.ConverterReaisALibra(valorRecebido);
			break;
		case "De Reais a Peso Argentino":
			moedas.ConverterReaisAPesoArgentino(valorRecebido);
			break;
		case "De Reais a Peso Chileno":
			moedas.ConverterReaisALibra(valorRecebido);
			break;
		case "De Dolares a Reais":
			moedas.ConverterDolarAReais(valorRecebido);
			break;
		case "De Euros a Reais":
			moedas.ConverterEuroAReais(valorRecebido);
			break;
		case "De Libra a Reais":
			moedas.ConverterEuroAReais(valorRecebido);
			break;
		case "De Peso Argentino a Reais":
			moedas.ConverterEuroAReais(valorRecebido);
			break;
		case "De Peso Chileno a Reais":
			moedas.ConverterEuroAReais(valorRecebido);
			break;
		}

	}
}
