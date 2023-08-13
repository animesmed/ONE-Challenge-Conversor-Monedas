package ConversorTemperatura;

import java.util.Scanner;

public class ConversorTemperaturas{
	public static boolean cancelado = false;
	public static void Convertir(double TemperaturaInicial, Scanner in) {
		double nuevaTemperatura = 0.0;
		cancelado = false;
		String[] textos = new String[2];
		textos[0] = "";
		textos[1] = "";
		switch (menu(in)) {
			case 0:
				System.out.println("\n== Conversion Cancelada ==\n");
				cancelado = true;
				return;
			//-----Celsius
			case 1:
				nuevaTemperatura = Temperaturas.celsiusAFahrenheit(TemperaturaInicial);
				textos[0] = "Celsius";
				textos[1] = "Fahrenheit";
				break;
			case 2:
				nuevaTemperatura = Temperaturas.celsiusAKelvin(TemperaturaInicial);
				textos[0] = "Celsius";
				textos[1] = "Kelvin";
				break;
			case 3:
				nuevaTemperatura = Temperaturas.celsiusAReaumur(TemperaturaInicial);
				textos[0] = "Celsius";
				textos[1] = "Reaumur";
				break;
			case 4:
				nuevaTemperatura = Temperaturas.celsiusARankine(TemperaturaInicial);
				textos[0] = "Celsius";
				textos[1] = "Rankine";
				break;
			//-----Fahrenheit
			case 5:
				nuevaTemperatura = Temperaturas.fahrenheitACelsius(TemperaturaInicial);
				textos[0] = "Fahrenheit";
				textos[1] = "Celsius";
				break;
			case 6:
				nuevaTemperatura = Temperaturas.fahrenheitAKelvin(TemperaturaInicial);
				textos[0] = "Fahrenheit";
				textos[1] = "Kelvin";
				break;
			case 7:
				nuevaTemperatura = Temperaturas.fahrenheitAReaumur(TemperaturaInicial);
				textos[0] = "Fahrenheit";
				textos[1] = "Reaumur";
				break;
			case 8:
				nuevaTemperatura = Temperaturas.fahrenheitARankine(TemperaturaInicial);
				textos[0] = "Fahrenheit";
				textos[1] = "Rankine";
				break;
			//-----Kelvin
			case 9:
				nuevaTemperatura = Temperaturas.kelvinACelsius(TemperaturaInicial);
				textos[0] = "Kelvin";
				textos[1] = "Celsius";
				break;
			case 10:
				nuevaTemperatura = Temperaturas.kelvinAFahrenheit(TemperaturaInicial);
				textos[0] = "Kelvin";
				textos[1] = "Fahrenheit";
				break;
			case 11:
				nuevaTemperatura = Temperaturas.kelvinAReaumur(TemperaturaInicial);
				textos[0] = "Kelvin";
				textos[1] = "Reumur";
				break;
			case 12:
				nuevaTemperatura = Temperaturas.kelvinARankine(TemperaturaInicial);
				textos[0] = "Kelvin";
				textos[1] = "Rankine";
				break;
			//-----Reaumur
			case 13:
				nuevaTemperatura = Temperaturas.reaumurACelsius(TemperaturaInicial);
				textos[0] = "Reaumur";
				textos[1] = "Celsius";
				break;
			case 14:
				nuevaTemperatura = Temperaturas.reaumurAFahrenheit(TemperaturaInicial);
				textos[0] = "Reaumur";
				textos[1] = "Fahrenheit";
				break;
			case 15:
				nuevaTemperatura = Temperaturas.reaumurAKelvin(TemperaturaInicial);
				textos[0] = "Reaumur";
				textos[1] = "Kelvin";
				break;
			case 16:
				nuevaTemperatura = Temperaturas.reaumurARankine(TemperaturaInicial);
				textos[0] = "Reaumur";
				textos[1] = "Rankine";
				break;
			//-----Rankine
			case 17:
				nuevaTemperatura = Temperaturas.rankineACelsius(TemperaturaInicial);
				textos[0] = "Rankine";
				textos[1] = "Celsius";
				break;
			case 18:
				nuevaTemperatura = Temperaturas.rankineAFahrenheit(TemperaturaInicial);
				textos[0] = "Rankine";
				textos[1] = "Fahrenheit";
				break;
			case 19:
				nuevaTemperatura = Temperaturas.rankineAKelvin(TemperaturaInicial);
				textos[0] = "Rankine";
				textos[1] = "Kelvin";
				break;
			case 20:
				nuevaTemperatura = Temperaturas.rankineAReaumur(TemperaturaInicial);
				textos[0] = "Rankine";
				textos[1] = "Reaumur";
				break;
		}
		
		System.out.println("==================================================");
		System.out.println(TemperaturaInicial +" grados "+textos[0]+" son "+nuevaTemperatura + " grados "+textos[1]);
		System.out.println("==================================================");
	}
	
	private static int menu(Scanner in) {
		System.out.println("\n\n=== Convirtiendo TEMPERATURAS ====");
		System.out.println("=========== CELSIUS A OTRA MEDIDA ===========");
		System.out.println("1.- Convertir CELSIUS a FAHRENHEIT");
		System.out.println("2.- Convertir CELSIUS a KELVIN");
		System.out.println("3.- Convertir CELSIUS a REAUMUR");
		System.out.println("4.- Convertir CELSIUS a RANKINE");
		System.out.println("=========== FAHRENHEIT A OTRA MEDIDA ===========");
		System.out.println("5.- Convertir FAHRENHEIT a CELSIUS");
		System.out.println("6.- Convertir FAHRENHEIT a KELVIN");
		System.out.println("7.- Convertir FAHRENHEIT a REAUMUR");
		System.out.println("8.- Convertir FAHRENHEIT a RANKINE");
		System.out.println("=========== KELVIN A OTRA MEDIDA ===========");
		System.out.println("9.- Convertir KELVIN a CELSIUS");
		System.out.println("10.- Convertir KELVIN a FAHRENHEIT");
		System.out.println("11.- Convertir KELVIN a REAUMUR");
		System.out.println("12.- Convertir KELVIN a RANKINE");
		System.out.println("=========== REAUMUR A OTRA MEDIDA ===========");
		System.out.println("13.- Convertir REAUMUR a CELSIUS");
		System.out.println("14.- Convertir REAUMUR a FAHRENHEIT");
		System.out.println("15.- Convertir REAUMUR a KELVIN");
		System.out.println("16.- Convertir REAUMUR a RANKINE");
		System.out.println("=========== RANKINE A OTRA MEDIDA ===========");
		System.out.println("17.- Convertir RANKINE a CELSIUS");
		System.out.println("18.- Convertir RANKINE a FAHRENHEIT");
		System.out.println("19.- Convertir RANKINE a KELVIN");
		System.out.println("20.- Convertir RANKINE a REAUMUR");
		
		System.out.println("\n0.- EXIT");
		System.out.print("\nIngrese una opcion -> ");
		return in.nextInt();
	}
}
