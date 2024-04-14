package Animales;

public interface Animal {
		
	void comer(); // definición de metodo
		
	void dormir(); // definición de metodo
		
	void volar(); // definición de metodo
	
}


/*
 * Segregación de Interfaces: 
 * Se centra en la estructuracion adecuada de las interfaces.
 * Ninguna clase debe verse forzada a implementar métodos que no utiliza, y las
interfaces deben ser específicas para las necesidades de las clases que las utilizan.
pequeñas, cohesivas y específicas

Animal
 Clases
Perro: Come, duerme, pero no vuela
Pez: Come, duerme, pero no vuelan
Pajaro: come, duerme y vuela
 * */
 