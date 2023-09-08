package Ejercicio02;

import Calculadora.Calculadora;


public class Principal {

	 public static void main(String[] args) {
		 // Variables con valores fijos
	        int a = 10;
	        int b = 5;

	        // Realizamos las operaciones
	        int suma = Calculadora.suma(a, b);
	        int resta = Calculadora.resta(a, b);
	        int multiplicacion = Calculadora.multiplicacion(a, b);
	        int division = Calculadora.division(a, b);

	        // Mostramos los resultados
	        System.out.println("Resultado de la suma: " + suma);
	        System.out.println("Resultado de la resta: " + resta);
	        System.out.println("Resultado de la multiplicación: " + multiplicacion);
	        System.out.println("Resultado de la división: " + division);

	        // Calculamos la potencia de a elevado a b
	        double potencia = Calculadora.potenciacion(a, b);
	        System.out.println("Potencia de " + a + " elevado a " + b + ": " + potencia);

	        // Calculamos la raíz cuadrada de a y b
	        double raizA = Calculadora.raizCuadrada(a);
	        double raizB = Calculadora.raizCuadrada(b);
	        System.out.println("Raíz cuadrada de " + a + ": " + raizA);
	        System.out.println("Raíz cuadrada de " + b + ": " + raizB);
	    
	    }

}
