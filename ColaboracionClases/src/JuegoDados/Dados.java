package JuegoDados;

/*2 dados , que el sistema los "tire" , si los lados son iguales "gane" si son distintos "Perdiste*/

public class Dados {
	
	private int ladoDado;
	
	public void tirarDado() {
		ladoDado = 1 +(int)(Math.random()*6);
	}
	
	public void IndicarLadoDado() {
		System.out.println("el lado del dado es: " + ladoDado);
		
	}
	
	public int mostrarLadoDado() {
		return ladoDado;
	}
}


/*
 * la colaboración de clases se refiere a la interacción y cooperación entre diferentes clases para lograr un objetivo común
 * 
 *Beneficios:
 *Codigo sea flexible
 *Reutilizar codigo
 *modular
 *facibilidad de manteniento 
 * 
 * 
 * */
 