package pe.cibertec.app;

import java.util.Calendar;
import java.util.Scanner;

import pe.cibertec.util.Fechas;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String fecha1, fecha2;
		
		System.out.print("Ingrese la fecha1: ");
		fecha1 = scanner.nextLine();
		
		System.out.print("Ingrese la fecha2: ");
		fecha2 = scanner.nextLine();
		
		//Comparamos las fechas.
		
		boolean bandera = Fechas.compararFechas(fecha1, fecha2);
		
		System.out.println(bandera);
	}

}
