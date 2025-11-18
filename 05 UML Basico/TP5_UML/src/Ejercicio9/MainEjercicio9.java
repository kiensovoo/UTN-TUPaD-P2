package Ejercicio9;

public class MainEjercicio9 {
    public static void main(String[] args) {

        Paciente p = new Paciente("Lisandro Alarcon", "OSDE");
        Profesional pr = new Profesional("Dra. Huertas", "Cardiologia");

        CitaMedica c = new CitaMedica(
                "2025-05-23",
                "10:45",
                p,
                pr
        );

        System.out.println("--- Cita Medica ---");
        System.out.println("Fecha: " + c.getFecha());
        System.out.println("Hora: " + c.getHora());

        System.out.println("\n--- Paciente ---");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Obra social: " + p.getObraSocial());

        System.out.println("\n--- Profesional ---");
        System.out.println("Nombre: " + pr.getNombre());
        System.out.println("Especialidad: " + pr.getEspecialidad());
    }
}
