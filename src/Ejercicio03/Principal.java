package Ejercicio03;

import Calculadora.Calculadora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "adios mundo";
		char caracter = 'x';
		boolean encontrado = false;

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				encontrado = true;
				break; // Si encontramos el carácter, salimos del bucle.
			}
		}

		if (encontrado) {
			System.out.println("El carácter '" + caracter + "' está en la cadena.");
		} else {
			System.out.println("El carácter '" + caracter + "' no está en la cadena.");
		}
		
		int cantidadVocales = Calculadora.contarVocales(cadena);
		System.out.println("La cadena '" + cadena + "' tiene " + cantidadVocales + " vocales.");


	}
}
