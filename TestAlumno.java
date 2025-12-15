package examen1;

public class TestAlumno {
    public static void main(String[] args) {
        Asignatura[] materias = {
            new Asignatura(1, "Programacion de Base de Datos"),
            new Asignatura(2, "Programación Orientada a Objetos"),
            new Asignatura(3, "Modelacion 3D"),
            new Asignatura(4, "Java Junior"),
        };

        Alumno alumno = new Alumno(5146086, "Mathias", "Streich", "Universidad Autonoma", materias);

        System.out.println(alumno);
    }
}