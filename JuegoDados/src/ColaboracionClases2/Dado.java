package ColaboracionClases2;


/*al "lanzar" los dados si el valor es identico diga "ganaste" ; distinto "perdiste"
 * */
public class Dado {
	// 2 clases = dado, juegosdados
	//dado = atributos nro 
	//metodos tirar los datos
	//mostrar resultado
	//retornar valor
	
	//datos
	private int ladoDado;
	
	//metodos tirar los dados
	public void tirarDados() {
		ladoDado= 1+ (int)(Math.random()*6);
	}
	 //metodo
	public void mostrarDados() {
		System.out.println("El lado del dado es:  " + ladoDado);
	}
	
	//metodo retorno
	
	public int retornoDado() {
		return ladoDado;
	}
	
	
}
