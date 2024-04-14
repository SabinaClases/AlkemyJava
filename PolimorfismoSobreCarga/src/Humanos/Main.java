package Humanos;

public class Main {

	public static void main(String[] args) {
		Persona persona= new Persona(); // objeto
		
		persona.LenguajeNatal(); // mostrar el metodo abstracto
		persona.LenguajeNatal("Español"); // mostrar el primer caso de swicht
		persona.LenguajeNatal("Ingles"); // mostrar el segundo caso de swicht
		persona.LenguajeNatal("");
		
		
	}
}
