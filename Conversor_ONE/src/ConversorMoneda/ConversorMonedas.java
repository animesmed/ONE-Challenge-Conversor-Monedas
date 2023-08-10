package ConversorMoneda;

import java.util.Scanner;

public class ConversorMonedas {
	
	public static void ConvertirMoneda(double MontoInicial, Scanner in) {
		
		Monedas monedas = new Monedas();
		double factorAConvertir = 1;
		String monedaNombre = "Soles";
		
		switch (menu(in)) {
			case 0:
				System.out.println("Conversion Cancelada");
				return;
			case 1:
				factorAConvertir = monedas.dolarASol;
				monedaNombre = "Dolar/es";
				break;
			case 2:
				factorAConvertir = monedas.euroASol;
				monedaNombre = "Euro/s";
				break;
			case 3:
				factorAConvertir = monedas.librasEASol;
				monedaNombre = "Libra/s Esterlina/s";
				break;
			case 4:
				factorAConvertir = monedas.yenASol;
				monedaNombre = "Yen/es";
				break;
			case 5:
				factorAConvertir = monedas.wonASol;
				monedaNombre = "Won/s";
				break;
			//-----
			case 6:
				factorAConvertir = monedas.solADolar;
				break;
			case 7:
				factorAConvertir = monedas.solAEuro;
				break;
			case 8:
				factorAConvertir = monedas.solALibrasE;
				break;
			case 9:
				factorAConvertir = monedas.solAYen;
				break;
			case 10:
				factorAConvertir = monedas.solAWon;
				break;
		}
		
		double montoTransformado = Convertir(MontoInicial, factorAConvertir);
		System.out.println("==================================================");
		System.out.println("Tienes "+montoTransformado + " " + monedaNombre);
		System.out.println("==================================================");
	}
	
	private static double Convertir(double MontoInicial, double multiplicador) {
		return Math.round((MontoInicial * multiplicador) * 100.0) / 100.0;
	}
	
	private static int menu(Scanner in) {
		System.out.println("\n\n=== Convirtiendo MONEDAS ====");
		System.out.println("=========== SOL A OTRA MONEDA ===========");
		System.out.println("1.- Convertir SOLES a DOLARES");
		System.out.println("2.- Convertir SOLES a EUROS");
		System.out.println("3.- Convertir SOLES a LIBRAS ESTERLINAS");
		System.out.println("4.- Convertir SOLES a YEN JAPONES");
		System.out.println("5.- Convertir SOLES a WON SURCOREANO");
		System.out.println("=========== OTRA MONEDA A SOLES ==========");
		System.out.println("6.- Convertir DOLARES a SOLES");
		System.out.println("7.- Convertir EUROS a SOLES");
		System.out.println("8.- Convertir LIBRAS ESTERLINAS a SOLES");
		System.out.println("9.- Convertir YEN JAPONES a SOLES");
		System.out.println("10.- Convertir WON SURCOREANO a SOLES");
		System.out.println("\n0.- EXIT");
		System.out.print("\nIngrese una opcion -> ");
		return in.nextInt();
	}
}
