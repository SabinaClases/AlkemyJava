package Ejemplo;

import java.util.Scanner;

//Clase padre
public class Persona {// inicio clase

	// datos 
	protected Scanner teclado;
	protected String nombre;
	protected int edad;
	 
	//constructor 
	public Persona() {
		teclado= new Scanner(System.in);
	}
	
	//metodo
	
	public void IngresarDatos() {
		System.out.println("Ingrese el nombre: ");
		nombre = teclado.next();
		
		System.out.println("Ingrese la edad: ");
		edad = teclado.nextInt();
	}
	
	
	// mostrar datos
	
	public void mostrarDatos() {
		
		System.out.println("Su nombre es: " + nombre);
		System.out.println("Su edad es: " + edad);
	}
	
	
	
	
}// fin clase
