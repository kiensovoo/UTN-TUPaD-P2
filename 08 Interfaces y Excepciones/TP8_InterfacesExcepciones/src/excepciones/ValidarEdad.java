package excepciones;

import java.util.Scanner;

public class ValidarEdad {

    public static void validar() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();

        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad fuera del rango permitido.");
            }
            System.out.println("Edad válida.");

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
