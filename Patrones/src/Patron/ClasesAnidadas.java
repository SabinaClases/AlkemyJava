package Patron;

import java.util.Scanner;

public class ClasesAnidadas {

	public static void main(String[] args) {
		//DATOS E INGRESO
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Ingrese n: ");
		int n= teclado.nextInt();
		
		//mostrar patrones
		System.out.println("Patrón 1");
		mostrarPatron1(n);
		
		System.out.println("Patrón 2");
		mostrarPatron2(n);
		
		System.out.println("Patrón 3");
		mostrarPatron3(n);
	}
		
	public static void mostrarPatron1(int n) {
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Si estamos en el borde o en las esquinas, imprimir un asterisco
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    // Si no, imprimir un espacio en blanco
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
		}
	
	public static void mostrarPatron2(int n) {
        // Bucle exterior para recorrer las filas
        for (int i = 0; i < n; i++) {
            // Imprimir espacios antes de los asteriscos
            for (int j = -i; j > 0; j--) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            // Cambiar de línea al final de cada fila
            System.out.println();
        }
    }

    // Método para mostrar el Patrón 3
    public static void mostrarPatron3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Si estamos en el borde o en las esquinas, imprimir un asterisco
                if (i == j || i + j == n - 1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }

    public static void mostrarPatron4(int n) {
         for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == n - 1 && j == n - 1) {
                System.out.print("x");
            } else if (j < n - 1) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

}
