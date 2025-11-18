package Ejercicio3;

public class MainEjercicio3 {
    public static void main(String[] args) {

        Autor autor = new Autor("Julio Cortazar", "Argentina");

        Libro libro = new Libro(
                "Rayuela",
                "978-950-07-3210-0",
                autor
        );

        Editorial editorial = new Editorial("Alfaguara", "Av. Rivadavia 123");
        libro.setEditorial(editorial);

        System.out.println("--- Datos del libro ---");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());

        System.out.println("\n--- Autor ---");
        System.out.println("Nombre: " + autor.getNombre());
        System.out.println("Nacionalidad: " + autor.getNacionalidad());

        System.out.println("\n--- Editorial ---");
        System.out.println("Nombre: " + libro.getEditorial().getNombre());
        System.out.println("Direccion: " + libro.getEditorial().getDireccion());
    }
}
