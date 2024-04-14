package Animales;

public class Pez implements Descanso, Nadador, Comestible {

	@Override
	public void comer() {
		System.out.println("El pez come");
		
	}

	@Override
	public void nadar() {
		System.out.println("El pez nada");
		
	}

	@Override
	public void dormir() {
		System.out.println("El pez duerme");
		
	}
	
	

}
