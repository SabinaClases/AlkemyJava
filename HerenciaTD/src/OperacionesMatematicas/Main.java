package OperacionesMatematicas;

public class Main {
	//metodo ejecutor
	
	public static void main(String[] args) {
		Suma suma= new Suma();
		suma.IngresaNro1();
		suma.IngresaNro2();
		suma.operar();
		
		System.out.println("El resultado de la suma es: ");
		suma.mostrarResultado();
		
		Resta resta= new Resta();
		resta.IngresaNro1();
		resta.IngresaNro2();
		resta.operar();
		
		System.out.println("El resultado de la resta es: ");
		resta.mostrarResultado();
	}
}
