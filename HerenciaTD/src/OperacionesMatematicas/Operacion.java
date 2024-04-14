package OperacionesMatematicas;

import java.util.Scanner;

/*Proyecto operaciones matematicas suma, resta, operacion, prueba
 * 
 * */


public class Operacion { // clasePadre
	//datos 
	protected Scanner teclado;
	protected int nro1;
	protected int nro2;
	protected int resultado;
	
	public Operacion() {
		//teclado el cual sirve para solicitar el ingreso de datos
		teclado= new Scanner(System.in);
		
	}
	
	//solicitar el ingreso de datos por parte del usuario
	
	public void IngresaNro1() {
		System.out.print("Ingrese el número 1: ");
		nro1 = teclado.nextInt();
	}
	
	
	public void IngresaNro2() {
		System.out.print("Ingrese el número 2: ");
		nro2 = teclado.nextInt();
	}
	
	 public void mostrarResultado() {
		 System.out.println(resultado);
	 }
	

}

/* Operacion matematicas basicas a traves de herencia 
 *  Herencia: 
 *  	crear nuevas clases a partir de la clasePadre o SuperClase
 * 		Clases hijas heredan los metodos y atributos de la clasePadre, pero adicionalmente puede tener sus propios metodos 
 * 
 * 
 * Clase Padre:  Clase de la que desciende o deriva una clase. Las clases hijas (descendientes) heredan (incorporan)
 *  automáticamente los atributos y métodos de la la clase padre
 *  
 *  SubClases: Clase desciendiente de otra. Hereda automáticamente los atributos y métodos de su superclase. Es una especialización
 *   de otra clase. Admiten la definición de nuevos atributos y métodos para aumentar la especialización de la clase.
 *  
 * */
 