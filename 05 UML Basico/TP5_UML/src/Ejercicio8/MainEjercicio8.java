package Ejercicio8;

public class MainEjercicio8 {
    public static void main(String[] args) {

        Usuario u = new Usuario("Lisandro Alarcon", "lisandroalarcon68@gmail.com");

        FirmaDigital f = new FirmaDigital("A2F77D9912", "2025-03-19");
        f.setUsuario(u);

        Documento d = new Documento(
                "Contrato de servicios",
                "Contenido del contrato generado automaticamente.",
                f
        );

        System.out.println("--- Documento ---");
        System.out.println("Titulo: " + d.getTitulo());
        System.out.println("Contenido: " + d.getContenido());

        System.out.println("\n--- Firma Digital ---");
        System.out.println("Hash: " + d.getFirma().getCodigoHash());
        System.out.println("Fecha: " + d.getFirma().getFecha());

        System.out.println("\n--- Usuario asociado ---");
        System.out.println("Nombre: " + d.getFirma().getUsuario().getNombre());
        System.out.println("Email: " + d.getFirma().getUsuario().getEmail());
    }
}
