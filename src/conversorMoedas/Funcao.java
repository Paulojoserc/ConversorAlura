package conversorMoedas;

import javax.swing.JOptionPane;

public class Funcao {
	ConverterMoedas moedas = new ConverterMoedas();
public void COnverterMoedas( double valorRecebido) {
	String opcao = (JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja converter seu dinheiro", "Moedas", 
			JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De reais a Peso Argentino", "De Reais a Peso Chileno"}, "Escolha")).toString();
	switch(opcao) {
	case "De Reais a Dolares":
		moedas.ConverterReaisADolar(valorRecebido);
		break;
	}
}
}

