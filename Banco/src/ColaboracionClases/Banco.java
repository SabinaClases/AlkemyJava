package ColaboracionClases;

public class Banco {// inicio clase 

	/*atributo 3 clientes  -> objetos
	 * metodos: contructor, operar, desposito totales
	 * */
	
	private Cliente cliente1, cliente2,cliente3;
	//constrcutor
	
	public Banco() {
		cliente1=new Cliente("Miguel");
		cliente2=new Cliente("Sebastian");
		cliente3=new Cliente("Brisa");
	}
	
	//metodo operar
	public void operar() {
		cliente1.depositar(5000);
		cliente2.depositar(5500);
		cliente3.depositar(6000);
		cliente2.retirar(6000);
	}
	
	
	public void depositotal() {
		int t = cliente1.retornarMonto() + cliente2.retornarMonto() + 
				cliente3.retornarMonto();
		
		System.out.println("El monto total que deposito Miguel, Sebastian y Brisa es de $ "  + t);
		cliente1.imprimir();
		cliente2.imprimir();
		cliente3.imprimir();
	}
	
	public static void main(String[] args) {
		Banco banco= new Banco();
		banco.operar();
		banco.depositotal();
	}
	
	
	
	
	
}// fin clase
