package Animales;

public class Pajaro implements Descanso, Volador, Comestible {

	@Override
	public void comer() {
		System.out.println("El pájaro come");
	}

	@Override
	public void volar() {
		System.out.println("El pájaro vuela");
		
	}

	@Override
	public void dormir() {
		System.out.println("El pájaro duerme");
		
	}
	
	
}
