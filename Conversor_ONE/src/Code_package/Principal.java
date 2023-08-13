package Code_package;

//Java program to demonstrate working of Scanner in Java
import ConversorMoneda.ConversorMonedas;
import ConversorTemperatura.ConversorTemperaturas;

import javax.swing.JOptionPane;

/**
 * Este programa puede convertir monedas y temperaturas con una interfaz
 * usando JOptionPane
 * @author Annie
 * @version 1.0
 *
 */
public class Principal{
	/**
	 * Metodo main por defecto
	 * @param args
	 */
	public static void main(String[] args) {
		//===================================================================0
		/*
		- Convertir de la moneda de tu país a Dólar
      	- Convertir de la moneda de tu país  a Euros
      	- Convertir de la moneda de tu país  a Libras Esterlinas
      	- Convertir de la moneda de tu país  a Yen Japonés
      	- Convertir de la moneda de tu país  a Won sul-coreano
      	
      	- Convertir de Dólar a la moneda de tu país
        - Convertir de Euros a la moneda de tu país
        - Convertir de Libras Esterlinas a la moneda de tu país
        - Convertir de Yen Japonés a la moneda de tu país
        - Convertir de Won sul-coreano a la moneda de tu país
        
        Como desafío extra te animamos a que dejes fluir tu creatividad, 
        si puedo convertir divisas, ¿tal vez pueda añadir a mi programa otros 
        tipos de conversiones como temperatura por ejemplo?
		*/
		
		//Menu
		Object valorEscogido = null;
		do {
			/**
			 * Menu inicial con las 2 unicas conversiones
			 */
			Object[] opcionesMenu = {"Conversor de Moneda", "Conversor de Temperatura"};
			valorEscogido = JOptionPane.showInputDialog(null, 
					"Seleccione el tipo de Conversion a realizar", "Menu", JOptionPane.INFORMATION_MESSAGE, 
					null, opcionesMenu, opcionesMenu[0]);
			if(valorEscogido == null) {
				break;
			}
			if(valorEscogido.toString().equals("Conversor de Moneda")) {
				llamarConversorMonedas();
			}else if(valorEscogido.toString().equals("Conversor de Temperatura")){
				llamarConversorTemperaturas();
			}
			
		} while (valorEscogido != null);
		
		JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
				"Cerrando Programa","Exit",
				JOptionPane.INFORMATION_MESSAGE);
	}
	/**
	 * Metodo creado para poder preguntar al usuario si quiere volver a usar la conversión en
	 * la que se encuentre.
	 * @return boolean
	 */
	private static boolean MetodoAdicional() {
		int respuesta = JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(),
	             "Seguir convirtiendo", "¿Desea convertir de nuevo?", 
	             JOptionPane.YES_NO_OPTION);
		if(respuesta == JOptionPane.YES_OPTION) {
			return true;
		}else{
			return false;
		}
	}
	/**
	 * Metodo creado para poder leer un double por el usuario ingresado con punto o coma
	 * @param num
	 * @return Double
	 */
	private static double parseNumero(String num) {
		if(num.contains(",")) {
			num = num.replace(",",".");
		}
		return Double.parseDouble(num);
	}
	/**
	 * Metodo principal para el metodo de Convertir monedas, hace un llamado
	 * al metodo Convertir() de la clase ConversorMonedas.java
	 */
	private static void llamarConversorMonedas()  {
		/**
		 * Try catch para poder atrapar cualquier error en la digitacion del
		 * valor a convertir
		 */
		try {
			String numero = JOptionPane.showInputDialog(JOptionPane.getRootFrame(),
					"Ingrese el monto a transformar:","Dato a convertir",
					JOptionPane.QUESTION_MESSAGE);
			if(numero==null) {
				JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
						"Conversión cancelada","Alerta",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
			double monedas = parseNumero(numero);
			ConversorMonedas.Convertir(monedas);
			if(ConversorMonedas.cancelado) {
				return;
			}else {
				if(MetodoAdicional()) {
					llamarConversorMonedas();
				}else {
					return;
				}
			}
		}catch(NumberFormatException err) {
			JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
					"Debes Ingresar una cantidad numerica correcta","Alerta",
					JOptionPane.ERROR_MESSAGE);
			llamarConversorMonedas();
		}
	}
	/**
	 * Metodo principal para la conversión de temperaturas, hace un llamado al metodo 
	 * principal Convertir() de la clase ConversorTemperaturas.java
	 */
	private static void llamarConversorTemperaturas() {
		/**
		 * Sentencia try-catch para poder atrapar el error de digitación de valor a 
		 * convertir por el usuario
		 */
		try {
			String numero = JOptionPane.showInputDialog("Ingrese los grados a transformar:");
			if(numero==null) {
				JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
						"Conversión cancelada","Alerta",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
			double temperatura = parseNumero(numero);
			ConversorTemperaturas.Convertir(temperatura);
			if(ConversorTemperaturas.cancelado) {
				return;
			}else {
				if(MetodoAdicional()) {
					llamarConversorTemperaturas();
				}else {
					return;
				}
			}
		}catch(NumberFormatException err) {
			JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
					"Debes Ingresar una cantidad numerica correcta","Alerta",
					JOptionPane.ERROR_MESSAGE);
			llamarConversorTemperaturas();
		}
	}

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
}
