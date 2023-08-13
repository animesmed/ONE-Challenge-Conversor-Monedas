package ConversorMoneda;
/**
 * Clase con los valores de conversión de 5 monedas principales a la moneda de Peru (sol):
 * Dolares, Euros, Libras Esterlinas, Yenes, Wons
 * @author Annie
 *
 */
public class Monedas {
	/*
	- Convertir de la moneda de tu país a Dólar
  	- Convertir de la moneda de tu país  a Euros
  	- Convertir de la moneda de tu país  a Libras Esterlinas
  	- Convertir de la moneda de tu país  a Yen Japonés
  	- Convertir de la moneda de tu país  a Won sul-coreano
    */
	protected static double dolarASol = 3.70;
	protected static double euroASol = 4.06;
	protected static double librasEASol = 4.69;
	protected static double yenASol = 0.026;
	protected static double wonASol = 0.0028;
	
	//=======
		/*
		- Convertir de Dólar a la moneda de tu país
	    - Convertir de Euros a la moneda de tu país
	    - Convertir de Libras Esterlinas a la moneda de tu país
	    - Convertir de Yen Japonés a la moneda de tu país
	    - Convertir de Won sul-coreano a la moneda de tu país
		*/
	
	protected static double solADolar = Math.round((1/dolarASol) * 100.0) / 100.0;
	protected static double solAEuro = Math.round((1/euroASol) * 100.0) / 100.0;
	protected static double solALibrasE = Math.round((1/librasEASol) * 100.0) / 100.0;
	protected static double solAYen = Math.round((1/yenASol) * 100.0) / 100.0;
	protected static double solAWon = Math.round((1/wonASol) * 100.0) / 100.0;
	
}
