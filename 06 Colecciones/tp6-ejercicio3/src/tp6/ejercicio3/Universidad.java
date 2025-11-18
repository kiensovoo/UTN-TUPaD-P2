import java.util.ArrayList;

public class Universidad {

    private String nombre;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null && p != null) c.setProfesor(p);
    }

    public void listarProfesores() {
        for (Profesor p : profesores) p.mostrarInfo();
    }

    public void listarCursos() {
        for (Curso c : cursos) c.mostrarInfo();
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) c.getProfesor().eliminarCurso(c);
            cursos.remove(c);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);

        if (p != null) {
            for (Curso c : cursos) {
                if (c.getProfesor() == p) {
                    c.setProfesor(null);
                }
            }
            profesores.remove(p);
        }
    }
}
