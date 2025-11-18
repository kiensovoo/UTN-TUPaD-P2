package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {

    public static void leerArchivo() {

        try {
            File f = new File("texto.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado.");
        }
    }
}
