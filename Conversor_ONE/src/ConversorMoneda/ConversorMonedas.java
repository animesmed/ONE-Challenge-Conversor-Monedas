package ConversorMoneda;
import javax.swing.JOptionPane;
/**
 * Clase con metodos estaticos que contiene la propia transformación de las monedas
 * con sus mensajes usando la JOptionPane.
 * @author Annie
 *
 */
public class ConversorMonedas {
	/**
	 * Variable usada para poder controlar cuando el usuario cancela el metodo
	 * de convertir Monedas y poder regresar al menu inicial
	 */
	public static boolean cancelado = false;
	/**
	 * Metodo principal que recibe el parametro
	 * @param MontoInicial
	 * el cual es la cantidad de dinero digitada por el usuario a convertir.
	 */
	public static void Convertir(double MontoInicial) {
		double factorAConvertir = 1;
		cancelado = false;
		String monedaNombre = "Soles";
		Object aux = menu();
		if(aux == null) {
			JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
					"Conversión cancelada","Alerta",
					JOptionPane.ERROR_MESSAGE);
			cancelado = true;
			return;
		}
		switch (aux.toString()) {
			case "Convertir SOLES a DOLARES":
				factorAConvertir = Monedas.solADolar;
				monedaNombre = "Dolar/es";
				break;
			case "Convertir SOLES a EUROS":
				factorAConvertir = Monedas.solAEuro;
				monedaNombre = "Euro/s";
				break;
			case "Convertir SOLES a LIBRAS ESTERLINAS":
				factorAConvertir = Monedas.solALibrasE;
				monedaNombre = "Libra/s Esterlina/s";
				break;
			case "Convertir SOLES a YEN JAPONES":
				factorAConvertir = Monedas.solAYen;
				monedaNombre = "Yen/es";
				break;
			case "Convertir SOLES a WON SURCOREANO":
				factorAConvertir = Monedas.solAWon;
				monedaNombre = "Won/s";
				break;
			//-----
			case "Convertir DOLARES a SOLES":
				factorAConvertir = Monedas.dolarASol;
				break;
			case "Convertir EUROS a SOLES":
				factorAConvertir = Monedas.euroASol;
				break;
			case "Convertir LIBRAS ESTERLINAS a SOLES":
				factorAConvertir = Monedas.librasEASol;
				break;
			case "Convertir YEN JAPONES a SOLES":
				factorAConvertir = Monedas.yenASol;
				break;
			case "Convertir WON SURCOREANO a SOLES":
				factorAConvertir = Monedas.wonASol;
				break;
		}
		
		double montoTransformado = Convertir(MontoInicial, factorAConvertir);
		JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
				"Tienes "+montoTransformado + " " + monedaNombre,"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}
	/**
	 * Metodo que multiplica:
	 * @param MontoInicial
	 * @param multiplicador
	 * Para devolver el resultado redondeado con 2 decimales:
	 * @return Double
	 */
	private static double Convertir(double MontoInicial, double multiplicador) {
		return Math.round((MontoInicial * multiplicador) * 100.0) / 100.0;
	}
	/**
	 * Metodo donde muestra las posibles opciones de conversión, devuelve un
	 * @return Object
	 * que servira para el metodo Convertir() conteniendo la opcion elegida
	 */
	private static Object menu() {
		Object[] opcionesMenu = {"Convertir SOLES a DOLARES",
				"Convertir SOLES a EUROS",
				"Convertir SOLES a LIBRAS ESTERLINAS",
				"Convertir SOLES a YEN JAPONES",
				"Convertir SOLES a WON SURCOREANO",
				"Convertir DOLARES a SOLES",
				"Convertir EUROS a SOLES",
				"Convertir LIBRAS ESTERLINAS a SOLES",
				"Convertir YEN JAPONES a SOLES",
				"Convertir WON SURCOREANO a SOLES"};
		Object valorEscogido = JOptionPane.showInputDialog(null, 
				"Elija la moneda a convertir su saldo", "Menu - Monedas", 
				JOptionPane.QUESTION_MESSAGE,
				null, opcionesMenu, opcionesMenu[0]);
		return valorEscogido;
	}
}
