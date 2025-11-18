import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anio, Autor autor) {
        libros.add(new Libro(isbn, titulo, anio, autor));
    }

    public void listarLibros() {
        for (Libro l : libros) l.mostrarInfo();
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) return l;
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        if (l != null) libros.remove(l);
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) l.mostrarInfo();
        }
    }

    public void mostrarAutoresDisponibles() {
        for (Libro l : libros) {
            l.getAutor().mostrarInfo();
        }
    }
}
