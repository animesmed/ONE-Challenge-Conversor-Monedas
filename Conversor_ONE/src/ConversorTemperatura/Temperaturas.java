package ConversorTemperatura;

public class Temperaturas {
	//Celsius
	public double celsiusAKelvin(double x){
		return redondear(x + 273.15);
	}
	public double celsiusAFahrenheit(double x){
		return redondear((x*(9/5))+32);
	}
	public double celsiusAReaumur(double x){
		return redondear(x*0.8);
	}
	public double celsiusARankine(double x){
		return redondear((x*(9/5))+491.67);
	}
	//Kelvin
	public double kelvinACelsius(double x){
		return redondear(x-273.15);
	}
	public double kelvinAFahrenheit(double x){
		return redondear(x+273.15);
	}
	public double kelvinAReaumur(double x){
		return redondear((x-273.15)*(4/5));
	}
	public double kelvinARankine(double x){
		return redondear(x*1.8);
	}
	//Fahrenheit
	public double fahrenheitACelsius(double x){
		return redondear((x-32)*(5/9));
	}
	public double fahrenheitAKelvin(double x){
		return redondear(((x-32)*(5/9))+273.15);
	}
	public double fahrenheitAReaumur(double x){
		return redondear((x-32)*(4/9));
	}
	public double fahrenheitARankine(double x){
		return redondear(x+459.67);
	}
	//Reaumur
	public double reaumurACelsius(double x){
		return redondear(x*(5/4));
	}
	public double reaumurAKelvin(double x){
		return redondear(x*(5/4)+273.15);
	}
	public double reaumurAFahrenheit(double x){
		return redondear((x*(9/4))+32);
	}
	public double reaumurARankine(double x){
		return redondear((x*(9/4)+491.67));
	}
	//Rankine
	public double rankineACelsius(double x){
		return redondear((x-491.67)*(5/9));
	}
	public double rankineAKelvin(double x){
		return redondear(((x-491.67)*(5/9))+273.15);
	}
	public double rankineAFahrenheit(double x){
		return redondear(x-459.67);
	}
	public double rankineAReaumur(double x){
		return redondear((x-491.67)*(4/9));
	}
	//Redondeo
	private double redondear(double a) {
		return Math.round(a * 100.0) / 100.0;
	}
}
