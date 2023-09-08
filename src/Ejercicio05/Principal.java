package Ejercicio05;

import Calculadora.Calculadora;

import java.util.Scanner; //aqui importamos funciones nativas del lenguaje java*/


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Declaramos la variable para almacenar el número ingresado
	    int numero;

	    // Solicitamos al usuario que ingrese un número
	    System.out.println("Ingrese un número entre 0 y 10: ");
	    Scanner sc = new Scanner(System.in);
	    numero = sc.nextInt();

	    // Validamos que el número ingresado esté dentro del rango [0,10]
	    while (numero < 0 || numero > 10) {
	      System.out.println("El número ingresado no está dentro del rango. Ingrese un número entre 0 y 10: ");
	      numero = sc.nextInt();
	    }

	    // Creamos un objeto de la clase Calculadora
	    Calculadora calculadora = new Calculadora();

	    // Llamamos al método factorial() para calcular el factorial del número ingresado
	    int factorial = calculadora.factorial(numero);

	    // Imprimimos el resultado por consola
	    System.out.println("El factorial del número ingresado es: " + factorial);
	    
	 // Cerramos el recurso
	    sc.close();
	}

}
