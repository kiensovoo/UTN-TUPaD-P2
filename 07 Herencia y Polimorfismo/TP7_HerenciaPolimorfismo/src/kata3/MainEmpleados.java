package kata3;

import java.util.ArrayList;

public class MainEmpleados {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Juan", 250000));
        empleados.add(new EmpleadoTemporal("Ana", 80, 1200));
        empleados.add(new EmpleadoPlanta("Luis", 300000));

        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " | Sueldo: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println(" → Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(" → Tipo: Temporal");
            }
        }
    }
}
