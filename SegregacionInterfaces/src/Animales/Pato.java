package Animales;

public class Pato implements Descanso, Volador, Comestible, Nadador  {

	@Override
	public void nadar() {
		System.out.println("El pato nada");
		
	}

	@Override
	public void comer() {
		System.out.println("El pato come");
		
	}

	@Override
	public void volar() {
		System.out.println("El pato vuela");
		
	}

	@Override
	public void dormir() {
		System.out.println("El pato duerme");
		
	}

	
	
}
