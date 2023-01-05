package conversorMetro;

import javax.swing.JOptionPane;

public class ConverterMetrosQuadradoHectare {
private	double metros = 1000, ha = 0.0001;;

	public double converterMetrosQuadradoParaHectare(double valorRecebido) {
        double metroParaHectare = valorRecebido * ha;
        metroParaHectare = (double) Math.round(metroParaHectare * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Graus Celsius são " + metroParaHectare + " Graus Fahrenheit ");
        return metroParaHectare;
    }
	public double converterHectareParaMetrosQuadrado(double valorRecebido) {
        double metroParaHectare = valorRecebido * (metros*10);
        metroParaHectare = (double) Math.round(metroParaHectare * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Graus Celsius são " + metroParaHectare + " Graus Fahrenheit ");
        return metroParaHectare;
    }
}
