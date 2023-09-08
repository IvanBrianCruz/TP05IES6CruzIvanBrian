package Ejercicio09;

import Usuario.Usuario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear una instancia de Usuario
        Usuario Usuario = new Usuario("cruz", "ivan", "ivan4912134@gmail.com", 24, 3000.0, 22500.0);

        // Mostrar los datos del usuario
        Usuario.mostrarDatos();
	}

}
