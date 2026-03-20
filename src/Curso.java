import java.util.ArrayList;

public class Curso implements MostrarTodo {

    public String nombre;
    public ArrayList<Alumno> alumnos;
    public ArrayList<Asignatura> asignaturas;
    public ArrayList<Profesor> profesores;

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public Curso(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList<>();
        asignaturas = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    @java.lang.Override
    public void mostrarTodo() {
        System.out.println("CURSO: " + nombre);

        mostrarAlumno();

        mostrarAsignatura();

        mostrarProfesor();
    }

    private void mostrarProfesor() {
        for (Profesor profesor : profesores) {
            System.out.println("Profesor: " + profesor.nombre);
        }
    }

    private void mostrarAsignatura() {
        for (Asignatura asignatura : asignaturas) {
            System.out.println("Asignatura: " + asignatura.nombre);
        }
    }

    private void mostrarAlumno() {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.nombre);
        }
    }
}
