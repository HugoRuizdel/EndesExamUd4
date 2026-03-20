public class Matricula {

    public Alumno alumno;
    public Asignatura asignatura;
    public Profesor profesor;
    public double nota;

    public Matricula(Alumno alumno, Asignatura asignatura, Profesor profesor, double nota) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.nota = nota;
    }

    public void mostrar() {
        System.out.println(alumno.nombre + " - " +
                asignatura.nombre + " - " +
                profesor.nombre + " - Nota: " + nota);
    }
}
