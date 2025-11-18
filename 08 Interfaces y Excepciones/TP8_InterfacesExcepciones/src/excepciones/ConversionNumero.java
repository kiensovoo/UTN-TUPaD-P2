package excepciones;

import java.util.Scanner;

public class ConversionNumero {

    public static void convertir() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();

            int valor = Integer.parseInt(texto);
            System.out.println("Número convertido: " + valor);

        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar un número entero válido.");
        }
    }
}
