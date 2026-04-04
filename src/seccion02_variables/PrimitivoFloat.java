package seccion02_variables;

public class PrimitivoFloat {

     static float varFlotante;

    public static void main(String[] args) {
        // El float es un tipo de dato numérico de punto flotante de 32 bits, con un rango aproximado de 1.4E-45 a 3.4E+38
        float numeroFloat = 3.4028235E38F; // El sufijo 'F' indica que es un literal de tipo float

        System.out.println("numeroFloat = " + numeroFloat);

        System.out.println("tipo float corresponde a byte a  " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a   " + Float.SIZE);
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE);


        double realDouble = 3.4028235E39; // El double es un tipo de dato numérico de punto flotante de 64 bits, con un rango aproximado de 4.9E-324 a 1.7E+308
        System.out.println("realDouble = " + realDouble);

        System.out.println("tipo double corresponde a byte a  " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a   " + Double.SIZE);
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE);



        System.out.println("varFlotante = " + varFlotante);



    }
}
