package Ejemplo;

public class Ejecutor {

	public static void main(String[] args) {
		
		Persona persona1= new Persona();
		Empleado empleado1= new Empleado();
		
		persona1.IngresarDatos();
		empleado1.cargarSueldo();
		empleado1.mostrarDatos();
		empleado1.mostrarSueldo();
		
			
		//persona1.mostrarDatos();
		//empleado1.mostrarDatos();
		//empleado1.mostrarSueldo();
	}
}
