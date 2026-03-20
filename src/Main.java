
public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso("1 DAM");

        Alumno alumno1 = new Alumno("Carlos", 20);
        Alumno alumno2 = new Alumno("Ana", 22);

        Profesor profesor1 = new Profesor("Juan", "Matematicas");
        Profesor profesor2 = new Profesor("Laura", "Programacion");

        Asignatura asignatura1 = new Asignatura("Matematicas");
        Asignatura asignatura2 = new Asignatura("Programacion");

        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);
        curso.agregarProfesor(profesor1);
        curso.agregarProfesor(profesor2);
        curso.agregarAsignatura(asignatura1);
        curso.agregarAsignatura(asignatura2);

        GestorMatriculas gestor = new GestorMatriculas();

        gestor.crearMatricula(alumno1, asignatura1, profesor1, 7);
        gestor.crearMatricula(alumno1, asignatura2, profesor2, 4);
        gestor.crearMatricula(alumno2, asignatura1, profesor1, 9);

        curso.mostrarTodo();

        System.out.println("------ MATRÍCULAS ------");
        gestor.mostrarTodas();

        System.out.println("------ APROBADOS ------");
        gestor.mostrarAprobados();

        System.out.println("Media global: " + gestor.mediaGlobal());

        gestor.subirNotaTodos(1);

        System.out.println("------ TRAS SUBIR NOTAS ------");
        gestor.mostrarTodas();
    }
}
