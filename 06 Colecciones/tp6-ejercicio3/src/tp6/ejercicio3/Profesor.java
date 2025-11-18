import java.util.ArrayList;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void agregarCurso(Curso c) {
        c.setProfesor(this);
    }

    public void eliminarCurso(Curso c) {
        c.setProfesor(null);
    }

    public void agregarCursoInterno(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void quitarCursoInterno(Curso c) {
        cursos.remove(c);
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println(c.getCodigo() + " - " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre +
                           " | Especialidad: " + especialidad +
                           " | Cantidad de cursos: " + cursos.size());
    }

    public String getId() {
        return id;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
}
