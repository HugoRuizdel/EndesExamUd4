public class Profesor {

    public String nombre;
    public String especialidad;

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Profesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrar() {
        System.out.println("Profesor: " + nombre + " - " + especialidad);
    }
}
