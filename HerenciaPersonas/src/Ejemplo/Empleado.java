package Ejemplo;

import java.util.Scanner;


public class Empleado extends Persona {

	protected int sueldo;
	
	public void cargarSueldo() {
		
		System.out.println("Ingresar sueldo $ ");
		sueldo= teclado.nextInt();
	}
	
	 public void mostrarSueldo() {
		 System.out.println("su sueldo es de $ "+ sueldo);
	 }
	
	
}
