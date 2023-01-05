package conversorMetro;

import javax.swing.JOptionPane;

public class FuncaoMetroHectare {
	ConverterMetrosQuadradoHectare metroHectare = new ConverterMetrosQuadradoHectare();

	public void ConverterMetrosQuadradoHectare(double valorRecebido) {
		String opcao = (JOptionPane.showInputDialog(null, "Escolha uma opção para converter",
				"MetroQuadrado ou Hectare", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De MetrosQuadrado(s) para Hectare(s)", "De Hectare(s) para MetrosQuadrado(s)" },
				"Escolha")).toString();
		switch (opcao) {
		case "De MetrosQuadrado(s) para Hectare(s)":
			metroHectare.converterMetrosQuadradoParaHectare(valorRecebido);
			break;
		case "De Hectare(s) para MetrosQuadrado(s)":
			metroHectare.converterHectareParaMetrosQuadrado(valorRecebido);
			break;
		}

	}
}