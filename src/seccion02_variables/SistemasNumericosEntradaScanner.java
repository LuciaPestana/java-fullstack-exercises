package seccion02_variables;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
       // String numeroStr = scanner.nextLine(); // Leemos el número como una cadena de texto
        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es un número entero válido.");
            main(args); // Volvemos a llamar al método main para solicitar el número nuevamente
            System.exit(0); // Salimos del programa para evitar continuar con un valor no válido
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario= "numero binario de   " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de  = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

         String resultadoHexadecimal = " numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje= " numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) + "\n";
        mensaje += " numero octal de  " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) + "\n";
        mensaje += " numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) + "\n";

        System.out.println(mensaje);

    }
}
