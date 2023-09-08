package Ejercicio04;

import Calculadora.Calculadora;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaramos las variables necesarias para almacenar un número entero
		int numero = 15;

		// Creamos un objeto de la clase Calculadora
		Calculadora calculadora = new Calculadora();

		// Llamamos al método determinarParImpar() para determinar si el número es par o
		// impar
		boolean esPar = calculadora.determinarParImpar(numero);

		// Imprimimos el resultado por consola
		if (esPar==true) {
			System.out.println("El número es par.");
			System.out.println("El triple del número es: " + (numero * 3));
		} else {
			System.out.println("El número es impar.");
			System.out.println("El doble del número es: " + (numero * 2));
		}
	}
}
