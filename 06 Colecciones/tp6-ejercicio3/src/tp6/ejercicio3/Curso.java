public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor nuevoProfesor) {

        if (this.profesor == nuevoProfesor) return;

        if (this.profesor != null) {
            this.profesor.quitarCursoInterno(this);
        }

        this.profesor = nuevoProfesor;

        if (nuevoProfesor != null) {
            nuevoProfesor.agregarCursoInterno(this);
        }
    }

    public void mostrarInfo() {
        String prof = (profesor == null ? "SIN PROFESOR" : profesor.getId());
        System.out.println(codigo + " - " + nombre + " | Profesor: " + prof);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
