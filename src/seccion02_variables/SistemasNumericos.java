package seccion02_variables;

import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog( null, "Ingrese un numero entero");

        try {
            Integer.parseInt(numeroStr); // Intentamos convertir el string a un entero
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog( null, "El valor ingresado no es un número entero válido.");
            main(args); // Volvemos a llamar al método main para solicitar el número nuevamente
            System.exit(0); // Salimos del programa para evitar continuar con un valor no válido
        }
        int numeroDecimal = Integer.parseInt(numeroStr); // Convertimos el string a un entero

        System.out.println("numeroDecimal = " + numeroDecimal);
        String resultadoBinario= "numero binario de   " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        System.out.println(resultadoBinario);
        int numeroBinario = 0b111110100;

        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de  = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 764;
        System.out.println("numeroOctal = " + numeroOctal);

         String resultadoHexadecimal = " numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje= " numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) + "\n";
        mensaje += " numero octal de  " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) + "\n";
        mensaje += " numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) + "\n";

        JOptionPane.showMessageDialog( null, mensaje);

    }
}
