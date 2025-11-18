public class MainBiblioteca {

    public static void main(String[] args) {

        Biblioteca b = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A01", "Borges", "Argentina");
        Autor a2 = new Autor("A02", "Cortázar", "Argentina");
        Autor a3 = new Autor("A03", "Lovecraft", "EEUU");

        b.agregarLibro("L1", "Ficciones", 1944, a1);
        b.agregarLibro("L2", "Rayuela", 1963, a2);
        b.agregarLibro("L3", "El Aleph", 1949, a1);
        b.agregarLibro("L4", "Dagon", 1919, a3);
        b.agregarLibro("L5", "Bestiario", 1951, a2);

        System.out.println("\n--- LISTA ---");
        b.listarLibros();

        System.out.println("\n--- BUSCAR L2 ---");
        b.buscarLibroPorIsbn("L2").mostrarInfo();

        System.out.println("\n--- FILTRAR AÑO 1949 ---");
        b.filtrarLibrosPorAnio(1949);

        System.out.println("\n--- ELIMINAR L4 ---");
        b.eliminarLibro("L4");
        b.listarLibros();

        System.out.println("\n--- TOTAL LIBROS ---");
        System.out.println(b.obtenerCantidadLibros());

        System.out.println("\n--- AUTORES DISPONIBLES ---");
        b.mostrarAutoresDisponibles();
    }
}
