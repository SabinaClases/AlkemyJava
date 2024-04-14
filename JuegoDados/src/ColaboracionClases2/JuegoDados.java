package ColaboracionClases2;

public class JuegoDados {
	
	private Dado dado1, dado2, dado3;
	
	/* constructor
	 * jugar
	 * */
	
	//constructor
	
	public JuegoDados() {
		dado1=new Dado();
		dado2=new Dado();
		dado3=new Dado();
	}
	
	//metodo jugar
	
	public void jugar() { //inicio jugar
		
		dado1.tirarDados();
		dado1.mostrarDados();
		
		dado2.tirarDados();
		dado2.mostrarDados();
		

		dado3.tirarDados();
		dado3.mostrarDados();
		
		if(dado1.retornoDado() == dado2.retornoDado() &&
			dado1.retornoDado()== dado3.retornoDado()) {
			System.out.println("Ganaste");
		} else {
			System.out.println("Perdiste");
		}
		
		
	}// fin jugar
	
	public static void main(String[] args) {
		JuegoDados juegoDados= new JuegoDados();
		juegoDados.jugar();
	}
	
	
	
	
	
}
