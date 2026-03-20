public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso("1 DAM");

        Alumno a1 = new Alumno("Carlos", 20);
        Alumno a2 = new Alumno("Ana", 22);

        Profesor p1 = new Profesor("Juan", "Matematicas");
        Profesor p2 = new Profesor("Laura", "Programacion");

        Asignatura as1 = new Asignatura("Matematicas");
        Asignatura as2 = new Asignatura("Programacion");

        curso.agregarAlumno(a1);
        curso.agregarAlumno(a2);
        curso.agregarProfesor(p1);
        curso.agregarProfesor(p2);
        curso.agregarAsignatura(as1);
        curso.agregarAsignatura(as2);

        GestorMatriculas gestor = new GestorMatriculas();

        gestor.crearMatricula(a1, as1, p1, 7);
        gestor.crearMatricula(a1, as2, p2, 4);
        gestor.crearMatricula(a2, as1, p1, 9);

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
