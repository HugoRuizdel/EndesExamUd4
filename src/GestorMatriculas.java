import java.util.ArrayList;

public class GestorMatriculas extends MostrarMatriculas {

    public GestorMatriculas() {
        matriculas = new ArrayList<>();
    }

    public void crearMatricula(Alumno alumno, Asignatura asignatura, Profesor profesor, double nota) {

        nota = notaCero(nota);

        Matricula matricula = new Matricula(alumno, asignatura, profesor, nota);

        matriculas.add(matricula);

        alumno.matricular(matricula);
    }

    private static double notaCero(double nota) {
        if (nota < 0) {
            nota = 0;
        }
        return nota;
    }

    public void mostrarAprobados() {
        for (Matricula matricula : matriculas) {
            if (matricula.nota >= 5) {
                System.out.println("APROBADO: " + matricula.alumno.nombre);
            }
        }
    }

    public void subirNotaTodos(double puntos) {
        for (Matricula matricula : matriculas) {
            matricula.nota = matricula.nota + puntos;

            notaDiez(matricula);
        }
    }

    private static void notaDiez(Matricula matricula) {
        if (matricula.nota > 10) {
            matricula.nota = 10;
        }
    }

    public double mediaGlobal() {
        double suma = 0;

        for (Matricula matricula : matriculas) {
            suma += matricula.nota;
        }

        if (matriculas.size() == 0) return 0;

        return suma / matriculas.size();
    }
}
