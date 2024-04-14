package Animales;

public class Perro implements Comestible, Descanso {

	@Override
	public void dormir() {
		
		System.out.println("El perro duerme");
		
	}

	@Override
	public void comer() {
		System.out.println("El perro come");
		
	}
	
	

}
