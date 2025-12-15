package examen2;



public class Ejercicio6 {
	public static void main (String[]args) {
		Persona p = new Persona("Laura", 28);
		System.out.println("Nombre :  " + p.nombre + " | Edad : " + p.edad);
	}
}

class Persona {
	String nombre;
	int edad ;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
}
