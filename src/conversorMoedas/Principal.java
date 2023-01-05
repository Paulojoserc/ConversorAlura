package conversorMoedas;

import javax.swing.JOptionPane;

import conversorMetro.FuncaoMetroHectare;

public class Principal {
	public static void main(String[] args) {
		Funcao moedas = new Funcao();
		FuncaoMetroHectare metroHectare = new FuncaoMetroHectare();
		
		while (true) {		

			String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", 
					JOptionPane.PLAIN_MESSAGE, null,new Object[] { "Conversor de Moeda", "Conversor de Metros por Hectares" }, "Escolha")
					.toString();
			switch (opcao) {
			case "Conversor de Moeda":
				String input = JOptionPane.showInputDialog("Insira um valor: ");
				if (existe(input)) {
					double valorRecebido = Double.parseDouble(input);
					moedas.ConverterMoedas(valorRecebido);

					int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.OK_OPTION == resposta) {
						System.out.println("Escolha opçao Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			case "Conversor de Metros para Hectares":
				input = JOptionPane.showInputDialog("Insira um valor em metro(s) ou hectare(s)");
				if (existe(input)) {
					double valorRecebido = Double.parseDouble(input);
					metroHectare.ConverterMetrosQuadradoHectare(valorRecebido);

					int resposta = 0;
					resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar");
					if (JOptionPane.OK_OPTION == resposta) {
						System.out.println("Escolha opçao Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;

			}
		} 
	}
	

	public static boolean existe(String valor) {
		try {
			double x = Double.parseDouble(valor);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
