package ConversorMoneda;

public class ConversorMonedas {
	
	public void ConvertirMoneda(double MontoInicial) {
		int op = -1;
		Monedas monedas = new Monedas();
		double factorAConvertir = 1;
		String monedaNombre = "Soles";
		menu();
		switch (op) {
			case 0:
				return;
			case 1:
				factorAConvertir = monedas.solAdolar;
				monedaNombre = "Dolar/es";
			case 2:
				factorAConvertir = monedas.solAEuro;
				monedaNombre = "Euro/s";
			case 3:
				factorAConvertir = monedas.solALibrasE;
				monedaNombre = "Libra/s";
			case 4:
				factorAConvertir = monedas.solAYen;
				monedaNombre = "Yen/es";
			case 5:
				factorAConvertir = monedas.solAWon;
				monedaNombre = "Won/s";
			//-----
			case 6:
				factorAConvertir = monedas.dolarASol;
			case 7:
				factorAConvertir = monedas.euroASol;
			case 8:
				factorAConvertir = monedas.librasEASol;
			case 9:
				factorAConvertir = monedas.yenASol;
			case 10:
				factorAConvertir = monedas.wonASol;
		}
		
		double montoTransformado = Convertir(MontoInicial, factorAConvertir);
		System.out.println("==================================================");
		System.out.println("Tienes "+montoTransformado + " " + monedaNombre);
		System.out.println("==================================================");
	}
	
	private double Convertir(double MontoInicial, double multiplicador) {
		return MontoInicial * multiplicador;
	}
	
	private void menu() {
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
	}
}
