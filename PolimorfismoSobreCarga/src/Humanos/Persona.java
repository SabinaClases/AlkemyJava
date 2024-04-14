package Humanos;

//Polimorfismo con sobrecarga de metodos, se usa el mismo nombre distinto retorno

public class Persona {

	public void LenguajeNatal() {
		System.out.println("Idioma del Animal"); // metodo abstracto
	}
	
	public void LenguajeNatal(String idioma) { // sobrecarga de metodo
		
		switch (idioma) {
		case "Español":
			System.out.println("Persona habla español");
			break;
		case "Ingles":
			System.out.println("Persona habla Ingles");
			break;
		default:
			System.out.println("Habla Frances");
			
		}
		
		
	}
	
}
