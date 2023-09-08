package Calculadora;

public class Calculadora {
	
	//ejercicio 2 ***********************************/

	 public static int suma(int a, int b) {
	        return a + b;
	    }

	    public static int resta(int a, int b) {
	        return a - b;
	    }

	    public static int multiplicacion(int a, int b) {
	        return a * b;
	    }

	    public static int division(int a, int b) {
	        if (b != 0) {
	            return a / b;
	        } else {
	            System.out.println("No se puede dividir por cero");
	            return 0;
	        }
	    }

	    public static double potenciacion(int a, int b) {
	        return Math.pow(a, b);
	    }

	    public static double raizCuadrada(int a) {
	        return Math.sqrt(a);
	    }
	    
	  //ejercicio 3 ***********************************/
	    
	    public static int contarVocales(String cadena) {
	        int contador = 0;

	        for (int i = 0; i < cadena.length(); i++) {
	            char caracter = cadena.charAt(i);
	            if (esVocal(caracter)) {
	                contador++;
	            }
	        }

	        return contador;
	    }

	    private static boolean esVocal(char caracter) {
	        caracter = Character.toLowerCase(caracter); // Convertir a minúscula para ser insensible a mayúsculas
	        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
	    }
	    
	    //ejercicio 4 ***********************************/
	    
	 // Método para determinar si un número es par o impar
		  public boolean determinarParImpar(int numero) {
		    return (numero % 2 == 0);
		  }
		  
		//ejercicio 5 ***********************************/
		  
		// Método para calcular el factorial de un número
		  public int factorial(int numero) {

		    // Declaramos la variable para almacenar el factorial
		    int factorial = 1;

		    // Iteramos desde 1 hasta el número ingresado
		    for (int i = 1; i <= numero; i++) {
		      // Multiplicamos el factorial por el número actual
		      factorial *= i;
		    }

		    // Devolvemos el factorial
		    return factorial;
		  }
		  
		//ejercicio 6 ***********************************/
		  
		  public static void cuentaAtrasFor() {
		        for (int i = 320; i >= 160; i -= 20) {
		            System.out.println(i);
		        }
		    }
		  
		//ejercicio 7 ***********************************/
		  
		  public static void cuentaAtrasWhile() {
		        int numero = 320;
		        while (numero >= 160) {
		            System.out.println(numero);
		            numero = numero - 20;
		        }
		    }
		  
		//ejercicio 8 ***********************************/  
		  
		  public static void cuentaAtrasDoWhile() {
		        int numero = 320;
		        do {
		            System.out.println(numero);
		            numero = numero - 20;
		        } while (numero >= 160);
		    }
	  
	    
}
