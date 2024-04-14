package Animales;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal(); // pasamos la Clase Animal a un objeto para poder utilizarla, al usar minusculas Java reconoce  "animal" como apodo
		animal.hacerSonido();
		
		Gato gato= new Gato();
		gato.hacerSonido();
		
		Perro perro= new Perro();
		perro.hacerSonido();
		
		Pollito pollito=new Pollito();
		pollito.hacerSonido();
		

	}

}
