import java.util.ArrayList;

public class Alumno {

    public String nombre;
    public int edad;
    public ArrayList<Matricula> matriculas;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.matriculas = new ArrayList<>();
    }

    public void matricular(Matricula matricula) {
        matriculas.add(matricula);
    }

    public void mostrarDatos() {
        System.out.println("Alumno: " + nombre);

        for (Matricula matricula : matriculas) {
            System.out.println("Asignatura: " + matricula.asignatura.nombre +
                    " Profesor: " + matricula.profesor.nombre +
                    " Nota: " + matricula.nota);
        }
    }

    public double calcularMedia() {
        double suma = 0;

        suma = getSumaMatricula(suma);

        if (matriculas.size() == 0) return 0;

        return suma / matriculas.size();
    }

    private double getSumaMatricula(double suma) {
        for (Matricula matricula : matriculas) {
            suma += matricula.nota;
        }
        return suma;
    }
}
