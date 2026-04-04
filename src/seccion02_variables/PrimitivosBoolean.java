package seccion02_variables;

public class PrimitivosBoolean {

    public static void main(String[] args) {
        // El boolean es un tipo de dato primitivo que representa un valor de verdad, con dos posibles valores: true o false
        boolean datoLogico = true; // El valor booleano se asigna sin comillas, ya que no es un literal de texto
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);
        float f = 12345e2f; // 123.45
        System.out.println("f = " + f);

        datoLogico = d < f; // true
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = 3-2 ==1;
        System.out.println("esIgual = " + esIgual);


    }
}
