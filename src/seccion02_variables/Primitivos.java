package seccion02_variables;

public class Primitivos {

    public static void main(String[] args) {
        // El byte es numérico entero de 8 bits, con un rango de -128 a 127
        byte numeroByte = 127;
        System.out.println("tipo byte corresponde a byte a  " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a   " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " +Byte.MIN_VALUE);

        short numeroShort= 32767;
        System.out.println("tipo short corresponde a byte a  " + Short.BYTES);
        System.out.println("tipo Short corresponde en bites a   " + Short.SIZE);
        System.out.println("Valor máximo de un Short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un Short: " + Short.MIN_VALUE);



        int numeroInt= 32768;
        System.out.println("tipo int corresponde a byte a  " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a   " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);

        long numeroLong= 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);

        System.out.println("tipo long corresponde a byte a  " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a   " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);

        var numeroVar= 127; // El var siempre es de tipo Integer






    }
}
