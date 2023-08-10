package ConversorMoneda;

public class Monedas {
	/*
	- Convertir de la moneda de tu país a Dólar
  	- Convertir de la moneda de tu país  a Euros
  	- Convertir de la moneda de tu país  a Libras Esterlinas
  	- Convertir de la moneda de tu país  a Yen Japonés
  	- Convertir de la moneda de tu país  a Won sul-coreano
    */
	protected double dolarASol = 3.70;
	protected double euroASol = 4.06;
	protected double librasEASol = 4.69;
	protected double yenASol = 0.026;
	protected double wonASol = 0.0028;
	
	//=======
		/*
		- Convertir de Dólar a la moneda de tu país
	    - Convertir de Euros a la moneda de tu país
	    - Convertir de Libras Esterlinas a la moneda de tu país
	    - Convertir de Yen Japonés a la moneda de tu país
	    - Convertir de Won sul-coreano a la moneda de tu país
		*/
	
	protected double solAdolar = Math.round((1/dolarASol) * 100.0) / 100.0;
	protected double solAEuro = Math.round((1/euroASol) * 100.0) / 100.0;
	protected double solALibrasE = Math.round((1/librasEASol) * 100.0) / 100.0;
	protected double solAYen = Math.round((1/yenASol) * 100.0) / 100.0;
	protected double solAWon = Math.round((1/wonASol) * 100.0) / 100.0;
	
}
