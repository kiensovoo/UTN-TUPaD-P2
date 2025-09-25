/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author lichu
 */
public class TP2 {

    public static void main(String[] args) {
        // Escribe un programa en Java que solicite al usuario un año y determine si es
        // bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
        // divisible por 400.
        
        /*
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa un año: ");
        int anio = input.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
        */
        
        // Ejercicio 2
        
        /*
        Scanner input = new Scanner(System.in);

        // Pedimos los tres números
        System.out.print("Ingresa el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = input.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = input.nextInt();

        int mayor;
        
        // Comparamos
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        // Resultado
        System.out.println("El mayor número es: " + mayor);
        */
        
        // Ejercicio 3
        
        /*
        int edad;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad: ");
        
        edad = input.nextInt();
        
        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad >= 12 && edad <=17) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad <=59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }
        
        */
        
        // Ejercicio 4:
        
        
        /*
        int precio;
        char categoria;
        int descuento;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el precio de un producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        int descontado = precio;
        
        System.out.println("Ahora ingresa la categoria: ");
        categoria = input.next().charAt(0);
        
        if (categoria == 'A') {
            descontado -= 0.1 * precio;
            descuento = 10;
        } else if (categoria == 'B') {
            descontado -= 0.15 * precio;
            descuento = 15;
        } else if (categoria == 'C') {
            descontado -= 0.3 * precio;
            descuento = 30;
        } else {
            System.out.println("Categoría incorrecta. Ingresa A, B o C.");
            descuento = 0;
        }
        
        System.out.println("Precio original: "+ precio);
        System.out.println("Descuento aplicado: "+descuento +"%");
        System.out.println("Precio final: "+descontado);
        
        */
        
        // Ejercicio 5:
        
        /*
        int n = 1;
        int acum = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa numeros uno por uno y sumaré los pares.");
        System.out.println("Para detenerlo ingresa 0.");
        
        while (n != 0) {
            n = Integer.parseInt(input.nextLine());
            if (n%2 == 0) {
                acum += n;
            }
            
        }
        
        System.out.println("Suma total: "+acum);

        */
        
        // Ejercicio 6:
        /*
        Scanner input = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int n;
        
        System.out.println("Ingresa 10 numeros y te diré si son negativos, positivos o ceros.");
        
        for (int i=0; i<10; i++) {
            
            n = Integer.parseInt(input.nextLine());
            
            if (n == 0) {
                ceros += 1;
            } else if (n < 0) {
                negativos += 1;
            } else {
                positivos += 1;
            }

        }
        
        System.out.println("Ceros totales: "+ceros);
        System.out.println("Negativos totales: "+negativos);
        System.out.println("Positivos totales: "+positivos);
        
        */
        
        // Ejercicio 7:
        /*
        Scanner input = new Scanner(System.in);
        double nota;
        
        do {
            System.out.println("Por favor ingresa una nota entre 0 y 10");
            nota = Double.parseDouble(input.nextLine());
            
            if (!(nota>=0 && nota<=10)) {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10");
            }
        } while (!(nota>=0 && nota<=10));
        
        System.out.println("Nota ingresada: "+nota);
        
        */
        
        // Ejercicio 8:
        
        /*
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el precio base de un producto:");
        double precioBase = input.nextDouble();
        
        System.out.println("Ingresa el porcentaje del impuesto (solo el numero)");
        double impuesto = input.nextDouble();
        
        System.out.println("Ingresa el porcentaje del descuento (solo el numero");
        double descuento = input.nextDouble();
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("Precio final del producto: "+precioFinal);
        
        */
        
        // Ejercicio 9:
        /*
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el precio de un producto: ");
        double precioProducto = input.nextDouble();
        
        System.out.println("Ingres el peso del paquete en kg: ");
        double peso = input.nextDouble();
        
        input.nextLine();
        System.out.println("Ingrese la zona de envio (Nacional/Internacional)");
        String zona = input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envio es: "+costoEnvio);
        System.out.println("El total a pagar es: "+totalCompra);
        */
        
        // Ejercicio 10:
        /*
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: "+nuevoStock);
        */
        
        // Ejercicio 11:
        
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        
        calcularDescuentoEspecial(precio);
        */
        
        // Ejercicio 12:
        
        /*
        double[] precios = {100.0, 250.0, 75.0, 300.0, 120.5};
        System.out.println("Precios originales: ");
        mostrarArray(precios);
        
        precios[2] = 89.75;
        precios[1] = 112.0;
        
        System.out.println("Precios modificados: ");
        mostrarArray(precios);

        */
        
        // Ejercicio 13:
        
        double[] arrayPrecios = {100.0, 250.0, 75.0, 300.0, 120.5};
        System.out.println("Precios originales: ");
        mostrarArrayRecursivo(arrayPrecios, 0);
        
        arrayPrecios[0] = 175.0;
        arrayPrecios[3] = 135.75;
        
        System.out.println("Precios modificados: ");
        mostrarArrayRecursivo(arrayPrecios, 0);
        
        
    }
    
    public static void mostrarArrayRecursivo(double[] arrayPrecios, int indice) {
        if (indice < arrayPrecios.length) {
            System.out.println("Producto n"+ (indice + 1)+ ": "+ arrayPrecios[indice]);
            mostrarArrayRecursivo(arrayPrecios, indice + 1);
        }
    }
    
    public static void mostrarArray(double[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.println("Producto n"+(i+1)+": "+ array[i]);
        }
    }
    
    static double DESCUENTO_ESPECIAL = 0.10;
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: "+descuentoAplicado);
        System.out.println("El precio final del producto es: "+precioFinal);
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return 5 * peso;
        } else {
            return 10 * peso;
        }
        
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * (impuesto/100)) - (precioBase * (descuento/100));
        return precioFinal;
    }
}
        

