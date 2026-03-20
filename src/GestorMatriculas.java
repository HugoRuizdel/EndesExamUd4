import java.util.ArrayList;

public class GestorMatriculas {

    public ArrayList<Matricula> matriculas;

    public GestorMatriculas() {
        matriculas = new ArrayList<>();
    }

    public void crearMatricula(Alumno a, Asignatura as, Profesor p, double nota) {

        if (nota < 0) {
            nota = 0;
        }

        Matricula m = new Matricula(a, as, p, nota);

        matriculas.add(m);

        a.matricular(m);
    }

    public void mostrarTodas() {
        for (Matricula m : matriculas) {
            System.out.println(
                m.alumno.nombre + " - " +
                m.asignatura.nombre + " - " +
                m.profesor.nombre + " - " +
                m.nota
            );
        }
    }

    public void mostrarAprobados() {
        for (Matricula m : matriculas) {
            if (m.nota >= 5) {
                System.out.println("APROBADO: " + m.alumno.nombre);
            }
        }
    }

    public void subirNotaTodos(double puntos) {
        for (Matricula m : matriculas) {
            m.nota = m.nota + puntos;

            if (m.nota > 10) {
                m.nota = 10;
            }
        }
    }

    public double mediaGlobal() {
        double suma = 0;

        for (Matricula m : matriculas) {
            suma += m.nota;
        }

        if (matriculas.size() == 0) return 0;

        return suma / matriculas.size();
    }
}
