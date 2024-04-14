package ColaboracionClases;


/*El POO no interviene una sola clase, sino que hay muchas clases que interactuan y
 *  se comunican
 * */
/* un banco tiene 3 clientes que pueden depositar y retirar dinero. 
*El banco necesita que al final del día se calcule la suma de dinero que esta depositada
* */
/*cliente (atributos: nombre y el monto)
 *metodos contructor, depositar, retirar, retornarMonto 
 * */

public class Cliente {// inicio clase
	
	//datos
	private String nombre;
	private int monto;
	
	
	//constructor 
	public Cliente(String nom) {
		nombre= nom;
		monto=0;
	}
	
	//metodo depositar
	public void depositar(int m) {
		monto=monto+m;
	}
	
	//metodo retirar
	public void retirar(int m) {
		monto=monto-m;
	}
	
	
	//metodo retornar
	public int retornarMonto() {
		return monto;
	}
	
	//metodo imprimir o mostrar
	
	public void imprimir() {
		System.out.println(nombre + "  tiene de saldo $ " + monto);
	}
	
	
}// fin clase
