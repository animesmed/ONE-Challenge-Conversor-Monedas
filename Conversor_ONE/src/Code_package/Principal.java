package Code_package;

//Java program to demonstrate working of Scanner in Java
import java.util.Scanner;
import javax.swing.ImageIcon;

import ConversorMoneda.ConversorMonedas;
import ConversorTemperatura.ConversorTemperaturas;

public class Principal{
	public static void main(String[] args) {
		
		/*
		//default message
		JOptionPane.showMessageDialog(getRootFrame(), "omg this is working.");
		//custom title, warning icon
		JOptionPane.showMessageDialog(getRootFrame(),
		    "And this still working xd",
		    "Warning",
		    JOptionPane.WARNING_MESSAGE);
		//custom title, error icon
		JOptionPane.showMessageDialog(getRootFrame(),
		    "Mensaje de error asi bien erroroso",
		    "Error",
		    JOptionPane.ERROR_MESSAGE);
		//custom title, no icon
		JOptionPane.showMessageDialog(getRootFrame(),
		    "Mensaje asi bien claro sin icono",
		    "A message without an icon",
		    JOptionPane.PLAIN_MESSAGE);
		//custom title, custom icon
		/*ImageIcon icon = createImageIcon("images/middle.gif",
                "a pretty but meaningless splat");
		JOptionPane.showMessageDialog(getRootFrame(),
		    "Ni idea que decir aca, no se como sacar el icono custom :c.",
		    "Dialogo Random",
		    JOptionPane.INFORMATION_MESSAGE);*/
		
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
		
		// Using Scanner for Getting Input from User
		Scanner in = new Scanner(System.in);
		
		//Menu
		int opcion = 1;
		do {
			System.out.println(".::MENU::.");
			System.out.println("Seleccione una opcion de conversion");
			System.out.println("1 -> Conversor de Moneda");
			System.out.println("2 -> Conversor de Temperatura");
			System.out.println("3 -> Exit");
			System.out.print("\nElija una opcion (No hay error)-> ");
			opcion = in.nextInt();
			if(opcion == 1) {
				llamarConversorMonedas(in);
			}else if(opcion == 2) {
				llamarConversorTemperaturas(in);
			}
			//LLamar de nuevo o menu o cancelar programa
			
			
		} while (opcion != 3);
		
		System.out.println("\n=== Cerrando programa ===");
		// closing scanner
		in.close();
		
	}
	
	private static boolean MetodoAdicional(Scanner in) {
		System.out.println("\n======> Desea convertir de nuevo (No hay error)? Y / N\n");
		String aux = in.next().toUpperCase();
		//Transformacion de texto a boolean
		if(aux.equals("Y")) {
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
	
	private static void llamarConversorMonedas(Scanner in)  {
		System.out.print("\n\nIngrese el monto a transformar(error): ");
		try {
			String numero = in.next();
			double monedas = parseNumero(numero);
			ConversorMonedas.Convertir(monedas, in); //-
			if(ConversorMonedas.cancelado) { //-
				return;
			}else {
				if(MetodoAdicional(in)) {
					llamarConversorMonedas(in);
				}else {
					return;
				}
			}
		}catch(NumberFormatException err) {
			System.out.println("\nError: Debes Ingresar una cantidad numerica correcta\n");
			in.nextLine(); // Limpiar el búfer del Scanner
			llamarConversorMonedas(in);
		}
	}
	
	private static void llamarConversorTemperaturas(Scanner in) {
		System.out.print("\n\nIngrese la temperatura a transformar(error): ");
		try {
			String numero = in.next();
			double temperatura = parseNumero(numero);
			ConversorTemperaturas.Convertir(temperatura, in);
			if(ConversorTemperaturas.cancelado) {
				return;
			}else {
				if(MetodoAdicional(in)) {
					llamarConversorTemperaturas(in);
				}else {
					return;
				}
			}
		}catch(NumberFormatException err) {
			System.out.println("\nError: Debes Ingresar una cantidad numerica correcta\n");
			in.nextLine(); // Limpiar el búfer del Scanner
			llamarConversorTemperaturas(in);
		}
	}
	
	/** Returns an ImageIcon, or null if the path was invalid. */
	protected ImageIcon createImageIcon(String path,
	                                           String description) {
	    java.net.URL imgURL = getClass().getResource(path);
	    if (imgURL != null) {
	        return new ImageIcon(imgURL, description);
	    } else {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
	}

	private static final long serialVersionUID = 1L;
	
}
