package ConversorTemperatura;

public class Temperaturas {
	//Celsius
	public static double celsiusAKelvin(double x){
		return redondear(x + 273.15);
	}
	public static double celsiusAFahrenheit(double x){
		return redondear((x*(9.0/5.0))+32);
	}
	public static double celsiusAReaumur(double x){
		return redondear(x*0.8);
	}
	public static double celsiusARankine(double x){
		return redondear((x*(9.0/5.0))+491.67);
	}
	//Kelvin
	public static double kelvinACelsius(double x){
		return redondear(x-273.15);
	}
	public static double kelvinAFahrenheit(double x){
		return redondear(x+273.15);
	}
	public static double kelvinAReaumur(double x){
		return redondear((x-273.15)*(4.0/5.0));
	}
	public static double kelvinARankine(double x){
		return redondear(x*1.8);
	}
	//Fahrenheit
	public static double fahrenheitACelsius(double x){
		return redondear((x-32)*(5.0/9.0));
	}
	public static double fahrenheitAKelvin(double x){
		return redondear(((x-32)*(5.0/9.0))+273.15);
	}
	public static double fahrenheitAReaumur(double x){
		return redondear((x-32)*(4.0/9.0));
	}
	public static double fahrenheitARankine(double x){
		return redondear(x+459.67);
	}
	//Reaumur
	public static double reaumurACelsius(double x){
		return redondear(x*(5.0/4.0));
	}
	public static double reaumurAKelvin(double x){
		return redondear(x*(5.0/4.0)+273.15);
	}
	public static double reaumurAFahrenheit(double x){
		return redondear((x*(9.0/4.0))+32);
	}
	public static double reaumurARankine(double x){
		return redondear((x*(9.0/4.0)+491.67));
	}
	//Rankine
	public static double rankineACelsius(double x){
		return redondear((x-491.67)*(5.0/9.0));
	}
	public static double rankineAKelvin(double x){
		return redondear(((x-491.67)*(5.0/9.0))+273.15);
	}
	public static double rankineAFahrenheit(double x){
		return redondear(x-459.67);
	}
	public static double rankineAReaumur(double x){
		return redondear((x-491.67)*(4.0/9.0));
	}
	//Redondeo
	private static double redondear(double a) {
		return Math.round(a * 100.0) / 100.0;
	}
}
