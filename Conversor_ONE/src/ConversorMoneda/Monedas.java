package ConversorMoneda;

public class Monedas {
	/*
	- Convertir de la moneda de tu país a Dólar
  	- Convertir de la moneda de tu país  a Euros
  	- Convertir de la moneda de tu país  a Libras Esterlinas
  	- Convertir de la moneda de tu país  a Yen Japonés
  	- Convertir de la moneda de tu país  a Won sul-coreano
    */
	public double DolarASol = 3.70;
	public double EuroASol = 4.06;
	public double LibrasEASol = 4.69;
	public double YenASol = 0.026;
	public double WonASol = 0.0028;
	
	//=======
		/*
		- Convertir de Dólar a la moneda de tu país
	    - Convertir de Euros a la moneda de tu país
	    - Convertir de Libras Esterlinas a la moneda de tu país
	    - Convertir de Yen Japonés a la moneda de tu país
	    - Convertir de Won sul-coreano a la moneda de tu país
		*/
	
	public double solAdolar = Math.round((1/DolarASol) * 100.0) / 100.0;
	public double solAEuro = Math.round((1/EuroASol) * 100.0) / 100.0;
	public double solALibrasE = Math.round((1/LibrasEASol) * 100.0) / 100.0;
	public double solAYen = Math.round((1/YenASol) * 100.0) / 100.0;
	public double solAWon = Math.round((1/WonASol) * 100.0) / 100.0;
	
}
