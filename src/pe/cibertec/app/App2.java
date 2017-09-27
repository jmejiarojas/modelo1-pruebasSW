package pe.cibertec.app;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {

		// Expresion que sea un numero de 3 digitos y que el primero sea 1, 2 o
		// 3
		String literal1 = "[123]\\d+";

		// Expresion regular validar que sea una cadena de como minimo 3
		// caracteres
		String literal2 = "\\w{3,}";

		// Expresion regular validar que sea una cadena de como minimo 3
		// caracteres
		String literal3 = "\\w{3}";

		Scanner scanner = new Scanner(System.in);

		String numero;

		System.out.print("Ingrese el primer campo");

		numero = scanner.nextLine();

		if (numero.matches(literal3)) {
			System.out.println("Cumple el formato");
		} else {
			System.out.println("No cumple el formato");
		}
	}

}
