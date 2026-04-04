package seccion02_variables;

public class Caracteres {

    public static void main(String[] args) {
        // El char es un tipo de dato primitivo que representa un solo carácter Unicode de 16 bits, con un rango de '\u0000' a '\uffff'
        char caracter = '\u0040'; //Usamos comilla simple para asignar un solo carácter a una variable de tipo char
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println(" decimal = caracter " + (decimal == caracter));

        System.out.println("tipo char corresponde a byte a  " + Character.BYTES);
        System.out.println("tipo char corresponde en bites a   " + Character.SIZE);
        System.out.println("Valor máximo de un char: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un char: " + Character.MIN_VALUE);


/*******************************************************
* Caracteres especiales
 *******************************************************/
        char espacio = ' '; // Espacio
        char espacio1 = '\u0020'; // Espacio en Unicode
        System.out.println("espacio = " + espacio);
        System.out.println("espacio1 = " + espacio1);
        System.out.println(" espacio = espacio1 " + (espacio == espacio1));

        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("System.getProperty( \"line.separator\" ) ); = " + System.getProperty( "line.separator" ) );







    }
}
