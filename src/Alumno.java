import java.util.ArrayList;

public class Alumno {

    public String nombre;
    public int edad;
    public ArrayList<Matricula> matriculas;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.matriculas = new ArrayList<>();
    }

    public void matricular(Matricula m) {
        matriculas.add(m);
    }

    public void mostrarDatos() {
        System.out.println("Alumno: " + nombre);

        for (Matricula m : matriculas) {
            System.out.println("Asignatura: " + m.asignatura.nombre +
                    " Profesor: " + m.profesor.nombre +
                    " Nota: " + m.nota);
        }
    }

    public double calcularMedia() {
        double suma = 0;

        for (Matricula m : matriculas) {
            suma += m.nota;
        }

        if (matriculas.size() == 0) return 0;

        return suma / matriculas.size();
    }
}
