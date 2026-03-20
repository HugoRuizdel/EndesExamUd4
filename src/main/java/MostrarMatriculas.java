public class MostrarMatriculas {
    public ArrayList<Matricula> matriculas;

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void mostrarTodas() {
        for (Matricula matricula : matriculas) {
            System.out.println(
                    matricula.alumno.nombre + " - " +
                            matricula.asignatura.nombre + " - " +
                            matricula.profesor.nombre + " - " +
                            matricula.nota
            );
        }
    }
}
