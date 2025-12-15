package examen1;

public class Persona {
	
	//Aqui se estaria realizando la declaracion de metodos privadas para los datos de las personas.
	
	private int  cedula;
	private String nombre;
	private String apellido;
	
	public Persona() {
		
	}
	
	//Este seria un constructor que inicia la cedula y deja valores ya listos a las variables de nombre y apellido es decir desconocidos.
	
	public Persona(int c) {
		setCedula(c);
		nombre = new String("Desconocido");
		apellido = new String("Desconocido");
	}
	
	public Persona(int c, String n, String a)
	{
		setCedula(c);
		setNombre(n);
		setApellido(a);
	}
	
	//Metodo que valida si la cedula es mayor a 500000 como pide en el examen, tambien si es menor a 500000 imprime un mensaje que pide al usuario que sea mayor de 500000
	public void setCedula(int c) {
	    if(c > 500000) {
	        cedula = c;
	    } else {
	        System.out.println("Error: la cédula debe ser mayor a 500000");
	    }
	}

	public void setNombre(String n) {
	    if(n.equals("")) {
	        System.out.println("Nombre no válido, se asignó 'Desconocido'");
	        nombre = "Desconocido";
	    } else {
	        nombre = n;
	    }
	}

	public void setApellido(String a) {
	    if(a.equals("")) {
	        System.out.println("Apellido no válido, se asignó 'Desconocido'");
	        apellido = "Desconocido";
	    } else {
	        apellido = a;
	    }
	}
	
	public int getCedula() {return cedula;}
	public String getNombre() {return nombre;}
	public String getApellido() {return apellido;}
	
	//Aqui lo que hace el override es sobreescribir los objetos de la clase para evitar errores a la hora del print , y que se vea mejor y sin errores a la vez que imprime los datos ingresados del usuario.
	@Override
	public String toString() {
		return cedula + "," + nombre + "," + apellido;
	}
}
