package InvDependencia;

/*
 * Operacion matematicas básicas suma, resta, multiplicacion y division
 * */

public class Calculadora {
	/*
	 * public int sumar(int nro1, int nro2) { return nro1 + nro2; }
	 * 
	 * public int restar(int nro1, int nro2) { return nro1 - nro2; }
	 * 
	 * public int multiplicar(int nro1, int nro2) { return nro1 * nro2; }
	 * 
	 * public int dividir(int nro1, int nro2) { return nro1 / nro2; }
	 */
	
	private OperacionesMatematicas operacion;
	
	public Calculadora(OperacionesMatematicas operacion) {
		this.operacion= operacion;
	}
	
	public double calcular( int nro1, int nro2) {
		return operacion.ejecutar(nro1, nro2);
	}
	
}
 /*Dependencia directa con las operaciones matematicas
  * 
  * */
  