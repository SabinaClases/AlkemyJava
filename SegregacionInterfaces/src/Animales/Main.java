package Animales;

//clase que ejecuta
public class Main {
	public static void main(String[] args) {
		 //clases a objeto
		Perro perro =new Perro();
		Pajaro pajaro = new Pajaro();
		Pez pez= new Pez();
		Pato pato = new Pato();
		
		
		//apodo + metodo
		perro.comer();
		perro.dormir();
		
		pajaro.comer();
		pajaro.dormir();
		pajaro.volar();
		
		pez.comer();
		pez.dormir();
		pez.nadar();
		
		pato.comer();
		pato.dormir();
		pato.volar();
		pato.nadar();
		
	}
}

/*
 * Conclusión : es buena practica de diseño; usa las líneas de codigo necesarias  
 * Hace que el código sea mas flexible, reutilizable y mantenible en el tiempo.
 * 
 * */
 