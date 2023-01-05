package conversorMoedas;

import javax.swing.JOptionPane;

public class ConverterMoedas {
	private double valorDolar=5.44, valorEuro=5.74, valorLibra=6.51, valorPChileno =0.0064, valorPArgentino=0.031 ;
	
 public void ConverterReaisADolar(double valor) {
	 double moedaDolar = valor / valorDolar;
	 moedaDolar = (double) Math.round(moedaDolar * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaDolar+ " Dólares");
 }
 public void ConverterReaisAEuro(double valor) {
	 double moedaEuro = valor / valorEuro;
	 moedaEuro = (double) Math.round(moedaEuro * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaEuro+ " Euros");
 }
 public void ConverterReaisALibra(double valor) {
	 double moedaLibra = valor / valorLibra;
	 moedaLibra = (double) Math.round(moedaLibra * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaLibra+ " Libra esterlina");
 }
 public void ConverterReaisAPesoChileno(double valor) {
	 double moedaPChileno = valor / valorPChileno;
	 moedaPChileno = (double) Math.round(moedaPChileno * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaPChileno+ " Peso chileno");
 }
 public void ConverterReaisAPesoArgentino(double valor) {
	 double moedaPArgentino = valor / valorPArgentino;
	 moedaPArgentino = (double) Math.round(moedaPArgentino * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaPArgentino+ " Peso argentino");
 }
 /* Inicio de outras moedas para real*/
 public void ConverterDolarAReais(double valor) {
	 double moedaReal = valor / 0.18;
	 moedaReal = (double) Math.round(moedaReal * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaReal+ " Reais");
}
 public void ConverterEuroAReais(double valor) {
	 double moedaReal = valor / 0.17;
	 moedaReal = (double) Math.round(moedaReal * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaReal+ " Reais");
}
 public void ConverterLibraAReais(double valor) {
	 double moedaReal = valor / 0.15;
	 moedaReal = (double) Math.round(moedaReal * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaReal+ " Reais");
}
 public void ConverterPesoArgentinoAReais(double valor) {
	 double moedaReal = valor / 32.76;
	 moedaReal = (double) Math.round(moedaReal * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaReal+ " Reais");
}
 public void ConverterPesoChilenoAReais(double valor) {
	 double moedaReal = valor / 156.95;
	 moedaReal = (double) Math.round(moedaReal * 100d)/100;
	 JOptionPane.showMessageDialog(null," Você tem $ "+moedaReal+ " Reais");
}
}