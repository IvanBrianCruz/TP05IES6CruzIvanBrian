package Ejercicio01;

import Usuario.Usuario;

public class principal {

	public static void main(String[] args) {
		// Declaramos las variables apellidos y nombres
	    String apellidos = "cruz";
	    String nombres = "ivan";

	    // Creamos un objeto usuario de la clase Usuario
	     Usuario Usuario = new Usuario();

	    // Seteamos los atributos del usuario con las variables del método main()
	    Usuario.setApellidos(apellidos);
	    Usuario.setNombre(nombres);

	    // Mostramos por consola los datos del usuario
	    System.out.println("Los datos del usuario son:");
	    System.out.println("Nombres: " + Usuario.getNombre());
	    System.out.println("Apellidos: " + Usuario.getApellidos());
	}

}


