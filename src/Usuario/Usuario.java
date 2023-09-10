package Usuario;

public class Usuario {
	
	  // ejercicio 1 *******************************/
	 private String apellidos;
	  private String nombre;

	  // Métodos accesores

	  public String getApellidos() {
	    return this.apellidos;
	  }

	  public void setApellidos(String apellidos) {
	    this.apellidos = apellidos;
	  }

	  public String getNombre() {
	    return this.nombre;
	  }

	  public void setNombre(String nombre) {
	    this.nombre = nombre;
	  }
	  
	  // ejercicio 9 ********************************/
	  
	 
	    private String nombres;
	    private String mail;
	    private int edad;
	    private double ingresosMensuales;
	    private double gastosMensuales;

	    // Constructor para inicializar los atributos
	    public Usuario(String apellidos, String nombres, String mail, int edad, double ingresosMensuales, double gastosMensuales) {
	        this.apellidos = apellidos;
	        this.nombres = nombres;
	        this.mail = mail;
	        this.edad = edad;
	        this.ingresosMensuales = ingresosMensuales;
	        this.gastosMensuales = gastosMensuales;
	    }

	 
		public Usuario() {
			// TODO Auto-generated constructor stub
		}

		// Método para determinar si el usuario es mayor de edad
	    public String esMayorDeEdad() {
	        if (edad >= 18) {
	            return "Es mayor de edad.";
	        } else {
	            return "Es menor de edad.";
	        }
	    }

	    // Método para determinar si la situación económica permite ahorrar
	    public String puedeAhorrar() {
	        if (ingresosMensuales > gastosMensuales) {
	            return "Puede ahorrar.";
	        } else {
	            return "No puede ahorrar debido a sus gastos mensuales.";
	        }
	    }


	    // Método para mostrar todos los datos del usuario por consola
	    public void mostrarDatos() {
	        System.out.println("Apellidos: " + apellidos);
	        System.out.println("Nombres: " + nombres);
	        System.out.println("Mail: " + mail);
	        System.out.println("Edad: " + edad);
	        System.out.println("Ingresos Mensuales: " + ingresosMensuales);
	        System.out.println("Gastos Mensuales: " + gastosMensuales);
	        System.out.println("Es Mayor de Edad: " + esMayorDeEdad());
	        System.out.println("Puede Ahorrar: " + puedeAhorrar());
	    }
}
