package ConversorTemperatura;
import javax.swing.JOptionPane;
/**
 * Clase con metodos estaticos que contiene la propia transformación de las temperaturas
 * con sus mensajes usando la JOptionPane.
 * @author Annie
 *
 */
public class ConversorTemperaturas{
	/**
	 * Variable usada para poder controlar cuando el usuario cancela el metodo
	 * de convertir Temperatura y poder regresar al menu inicial
	 */
	public static boolean cancelado = false;
	/**
	 * Metodo principal que recibe el parametro
	 * @param TemperaturaInicial
	 * el cual es la temperatura inicial digitada por el usuario a convertir.
	 */
	public static void Convertir(double TemperaturaInicial) {
		double nuevaTemperatura = 0.0;
		cancelado = false;
		String[] textos = new String[2];
		textos[0] = "";
		textos[1] = "";
		Object Aux = menu();
		if(Aux == null) {
			JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
					"Conversión cancelada","Alerta",
					JOptionPane.ERROR_MESSAGE);
			cancelado = true;
			return;
		}
		switch (Aux.toString()) {
			//-----Celsius
			case "Convertir CELSIUS a FAHRENHEIT":
				nuevaTemperatura = Temperaturas.celsiusAFahrenheit(TemperaturaInicial);
				textos[0] = "Celsius";
				textos[1] = "Fahrenheit";
				break;
			case "Convertir CELSIUS a KELVIN":
				nuevaTemperatura = Temperaturas.celsiusAKelvin(TemperaturaInicial);
				textos[0] = "Celsius";
				textos[1] = "Kelvin";
				break;
			case "Convertir CELSIUS a REAUMUR":
				nuevaTemperatura = Temperaturas.celsiusAReaumur(TemperaturaInicial);
				textos[0] = "Celsius";
				textos[1] = "Reaumur";
				break;
			case "Convertir CELSIUS a RANKINE":
				nuevaTemperatura = Temperaturas.celsiusARankine(TemperaturaInicial);
				textos[0] = "Celsius";
				textos[1] = "Rankine";
				break;
			//-----Fahrenheit
			case "Convertir FAHRENHEIT a CELSIUS":
				nuevaTemperatura = Temperaturas.fahrenheitACelsius(TemperaturaInicial);
				textos[0] = "Fahrenheit";
				textos[1] = "Celsius";
				break;
			case "Convertir FAHRENHEIT a KELVIN":
				nuevaTemperatura = Temperaturas.fahrenheitAKelvin(TemperaturaInicial);
				textos[0] = "Fahrenheit";
				textos[1] = "Kelvin";
				break;
			case "Convertir FAHRENHEIT a REAUMUR":
				nuevaTemperatura = Temperaturas.fahrenheitAReaumur(TemperaturaInicial);
				textos[0] = "Fahrenheit";
				textos[1] = "Reaumur";
				break;
			case "Convertir FAHRENHEIT a RANKINE":
				nuevaTemperatura = Temperaturas.fahrenheitARankine(TemperaturaInicial);
				textos[0] = "Fahrenheit";
				textos[1] = "Rankine";
				break;
			//-----Kelvin
			case "Convertir KELVIN a CELSIUS":
				nuevaTemperatura = Temperaturas.kelvinACelsius(TemperaturaInicial);
				textos[0] = "Kelvin";
				textos[1] = "Celsius";
				break;
			case "Convertir KELVIN a FAHRENHEIT":
				nuevaTemperatura = Temperaturas.kelvinAFahrenheit(TemperaturaInicial);
				textos[0] = "Kelvin";
				textos[1] = "Fahrenheit";
				break;
			case "Convertir KELVIN a REAUMUR":
				nuevaTemperatura = Temperaturas.kelvinAReaumur(TemperaturaInicial);
				textos[0] = "Kelvin";
				textos[1] = "Reumur";
				break;
			case "Convertir KELVIN a RANKINE":
				nuevaTemperatura = Temperaturas.kelvinARankine(TemperaturaInicial);
				textos[0] = "Kelvin";
				textos[1] = "Rankine";
				break;
			//-----Reaumur
			case "Convertir REAUMUR a CELSIUS":
				nuevaTemperatura = Temperaturas.reaumurACelsius(TemperaturaInicial);
				textos[0] = "Reaumur";
				textos[1] = "Celsius";
				break;
			case "Convertir REAUMUR a FAHRENHEIT":
				nuevaTemperatura = Temperaturas.reaumurAFahrenheit(TemperaturaInicial);
				textos[0] = "Reaumur";
				textos[1] = "Fahrenheit";
				break;
			case "Convertir REAUMUR a KELVIN":
				nuevaTemperatura = Temperaturas.reaumurAKelvin(TemperaturaInicial);
				textos[0] = "Reaumur";
				textos[1] = "Kelvin";
				break;
			case "Convertir REAUMUR a RANKINE":
				nuevaTemperatura = Temperaturas.reaumurARankine(TemperaturaInicial);
				textos[0] = "Reaumur";
				textos[1] = "Rankine";
				break;
			//-----Rankine
			case "Convertir RANKINE a CELSIUS":
				nuevaTemperatura = Temperaturas.rankineACelsius(TemperaturaInicial);
				textos[0] = "Rankine";
				textos[1] = "Celsius";
				break;
			case "Convertir RANKINE a FAHRENHEIT":
				nuevaTemperatura = Temperaturas.rankineAFahrenheit(TemperaturaInicial);
				textos[0] = "Rankine";
				textos[1] = "Fahrenheit";
				break;
			case "Convertir RANKINE a KELVIN":
				nuevaTemperatura = Temperaturas.rankineAKelvin(TemperaturaInicial);
				textos[0] = "Rankine";
				textos[1] = "Kelvin";
				break;
			case "Convertir RANKINE a REAUMUR":
				nuevaTemperatura = Temperaturas.rankineAReaumur(TemperaturaInicial);
				textos[0] = "Rankine";
				textos[1] = "Reaumur";
				break;
		}
		JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
				TemperaturaInicial+" grados "+textos[0]+" son "+nuevaTemperatura + " grados "+textos[1],
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}
	/**
	 * Metodo donde muestra las posibles opciones de conversión, devuelve un
	 * @return Object
	 * que servira para el metodo Convertir() conteniendo la opcion elegida
	 */
	private static Object menu() {
		Object[] opcionesMenu = {"Convertir CELSIUS a FAHRENHEIT",
				"Convertir CELSIUS a KELVIN",
				"Convertir CELSIUS a REAUMUR",
				"Convertir CELSIUS a RANKINE",
				"Convertir FAHRENHEIT a CELSIUS",
				"Convertir FAHRENHEIT a KELVIN",
				"Convertir FAHRENHEIT a REAUMUR",
				"Convertir FAHRENHEIT a RANKINE",
				"Convertir KELVIN a CELSIUS",
				"Convertir KELVIN a FAHRENHEIT",
				"Convertir KELVIN a REAUMUR",
				"Convertir KELVIN a RANKINE",
				"Convertir REAUMUR a CELSIUS",
				"Convertir REAUMUR a FAHRENHEIT",
				"Convertir REAUMUR a KELVIN",
				"Convertir REAUMUR a RANKINE",
				"Convertir RANKINE a CELSIUS",
				"Convertir RANKINE a FAHRENHEIT",
				"Convertir RANKINE a KELVIN",
				"Convertir RANKINE a REAUMUR"};
		Object valorEscogido = JOptionPane.showInputDialog(null, 
				"Elija los grados a convertir su temperatura", "Menu - Temperaturas", 
				JOptionPane.QUESTION_MESSAGE,
				null, opcionesMenu, opcionesMenu[0]);
		return valorEscogido;
	}
}
