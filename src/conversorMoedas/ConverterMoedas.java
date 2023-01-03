package conversorMoedas;

import javax.swing.JOptionPane;

public class ConverterMoedas {
 public void ConverterReaisADolar(double valor) {
	 double moedaDolar = valor / 5.44;
	 moedaDolar = (double) Math.round(moedaDolar * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaDolar+ " Dólares");
 }
 public void ConverterReaisAEuro(double valor) {
	 double moedaEuro = valor / 5.74;
	 moedaEuro = (double) Math.round(moedaEuro * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaEuro+ " Euros");
 }
 public void ConverterReaisALibra(double valor) {
	 double moedaLibra = valor / 6.51;
	 moedaLibra = (double) Math.round(moedaLibra * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaLibra+ " Libra esterlina");
 }
}
