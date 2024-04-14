package InvDependencia;

import java.text.DecimalFormat;

public class main {
	
	
	public static void main(String[] args) {
	// TODO Auto-generated constructor stub
		OperacionesMatematicas suma= new Suma();
		Calculadora calculadoraSuma = new Calculadora(suma);
		
		double resultadoSuma = calculadoraSuma.calcular(100, 50);
		System.out.println("El resultado de la suma de 100 + 50 = " + resultadoSuma);
		
		OperacionesMatematicas resta= new Resta();
		Calculadora calculadoraResta = new Calculadora(resta);
		
		double resultadoResta = calculadoraResta.calcular(100, 50 );
		System.out.println("El resultado de la resta de 100 - 50 = " + resultadoResta);
		
		OperacionesMatematicas multiplicacion = new Multiplicacion();
		Calculadora calculadoraMultiplicacion = new Calculadora(multiplicacion);
		
		double resultadoMultiplicacion = calculadoraMultiplicacion.calcular(100, 50);
		System.out.println("El resultado de la multiplicacion de 100 * 50 = " +resultadoMultiplicacion);
		
		// Division
		
		OperacionesMatematicas division= new Division();
		Calculadora calculadoradivision= new Calculadora(division);
		
		System.out.println("Aca mostrara el primer resultado en nros sin decimales");
		double resultadoDivision = calculadoradivision.calcular(100, 50);
		System.out.println("El resultado de la division de 100 + 50 = " +resultadoDivision);
		
		// Formateo de Decimales
		DecimalFormat decimalFormateo = new DecimalFormat("#.000");
		
		OperacionesMatematicas division2= new Division();
		Calculadora calculadoradivision2= new Calculadora(division2);
		
		System.out.println("Aca mostrara el primer resultado en nros con decimales");
		double resultadoDivision2 = calculadoradivision2.calcular(100, 32);
		System.out.println("El resultado de la division de 100 + 32 = " + decimalFormateo.format(resultadoDivision2));
		
		// 
		
		  OperacionesMatematicas division3= new Division(); Calculadora
		  calculadoradivision3= new Calculadora(division3);
		  
		  System.out.println("Aca debe indicar que no se puede dividir por cero"); 
		  double resultadoDivision3 = calculadoradivision3.calcular(100, 0);
		  System.out.println("El resultado de la division de 0 / 100 = " + resultadoDivision3);
		 
			/*
			 * try { OperacionesMatematicas division3 = new Division(); Calculadora
			 * calculadoradivision3 = new Calculadora(division3);
			 * System.out.println("Aca debe indicar que no se puede dividir por cero"); int
			 * resultadoDivision3 = calculadoradivision3.calcular(100, 0);
			 * System.out.println(resultadoDivision3); }catch(Exception e) {
			 * System.out.println("Error no se puede dividir por cero"); }
			 */
	}
}
