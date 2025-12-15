package examen1;


//La clase extiende a la clase persona para usar sus datos y asi tambien define variables propias
public class Alumno extends Persona{
	
	String institucion;
	Asignatura[] materias;
	
	public Alumno() {
		super();
	}
	
	public Alumno(int cedula, String nombre, String apellido, String institucion, Asignatura [] materias) {
		super(cedula, nombre, apellido);
		this.institucion = institucion;
		this.materias = materias;
	}
	
	public String getInstitucion() {
		return institucion;
	}
	
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	
	public Asignatura [] getMaterias() {
		return materias;
	}
	
	public void setMaterias(Asignatura[] materias) {
		this.materias = materias;
	}
	
	@Override
	public String toString() {
	    String resultado = "Estudiante \n";
	    resultado += "Numero de Cedula: " + getCedula() + "\n";
	    resultado += "Nombre : " + getNombre() + "\n";
	    resultado += "Apellido : " + getApellido() + "\n";
	    resultado += "Institucion : " + institucion + "\n";
	    resultado += "Materias :\n";
	    
	    if (materias != null) {
	        for (Asignatura m : materias) {
	            resultado += "  - " + m.getCodigo() + " | " + m.getNombre() + "\n";
	        }
	    } else {
	        resultado += "  (Este alumno no cuenta con materias)\n";
	    }
	    
	    return resultado;
	}
}

