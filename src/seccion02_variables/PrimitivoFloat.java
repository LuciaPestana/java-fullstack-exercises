package seccion02_variables;

public class PrimitivoFloat {

    public static void main(String[] args) {
        // El float es un tipo de dato numérico de punto flotante de 32 bits, con un rango aproximado de 1.4E-45 a 3.4E+38
        float numeroFloat = 3.4028235E38F; // El sufijo 'F' indica que es un literal de tipo float
        System.out.println("tipo float corresponde a byte a  " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a   " + Float.SIZE);
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE);
    }
}
