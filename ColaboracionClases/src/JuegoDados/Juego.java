
package JuegoDados;

public class Juego {
	
	private Dados dado1, dado2;

	public Juego() {
	
	dado1 = new Dados();
	dado2= new Dados();
	
	}
	
	public void Jugar() {
		
		dado1.tirarDado();
		dado1.IndicarLadoDado();
		dado1.mostrarLadoDado();
		
		dado2.tirarDado();
		dado2.IndicarLadoDado();
		dado2.mostrarLadoDado();
		
		if(dado1.mostrarLadoDado()==dado2.mostrarLadoDado()) {
			System.out.println("Ud gano");
		}else {
			System.out.println("Ud perdió");
		}
		
	}
	
	public static void main(String[] args) {
		Juego juegoDados= new Juego();
		juegoDados.Jugar();
		
	}
	

}
