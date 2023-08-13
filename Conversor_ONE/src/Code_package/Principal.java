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
			//--JOptionPane
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
	
	private static double parseNumero(String num) {
		if(num.contains(",")) {
			num = num.replace(",",".");
		}
		return Double.parseDouble(num);
	}
	
	private static void llamarConversorMonedas()  {
		try {
			//String numero = in.next();
			//JOptionPane
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
	
	private static void llamarConversorTemperaturas() {
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
