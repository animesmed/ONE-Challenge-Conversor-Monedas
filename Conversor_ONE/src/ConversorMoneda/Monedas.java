package ConversorMoneda;

public class Monedas {
	/*
	- Convertir de la moneda de tu país a Dólar
  	- Convertir de la moneda de tu país  a Euros
  	- Convertir de la moneda de tu país  a Libras Esterlinas
  	- Convertir de la moneda de tu país  a Yen Japonés
  	- Convertir de la moneda de tu país  a Won sul-coreano
    */
	protected static double solADolar = 3.70;
	protected static double solAEuro = 4.06;
	protected static double solALibrasE = 4.69;
	protected static double solAYen = 0.026;
	protected static double solAWon = 0.0028;
	
	//=======
		/*
		- Convertir de Dólar a la moneda de tu país
	    - Convertir de Euros a la moneda de tu país
	    - Convertir de Libras Esterlinas a la moneda de tu país
	    - Convertir de Yen Japonés a la moneda de tu país
	    - Convertir de Won sul-coreano a la moneda de tu país
		*/
	
	protected static double dolarASol = Math.round((1/solADolar) * 100.0) / 100.0;
	protected static double euroASol = Math.round((1/solAEuro) * 100.0) / 100.0;
	protected static double librasEASol = Math.round((1/solALibrasE) * 100.0) / 100.0;
	protected static double yenASol = Math.round((1/solAYen) * 100.0) / 100.0;
	protected static double wonASol = Math.round((1/solAWon) * 100.0) / 100.0;
	
}
