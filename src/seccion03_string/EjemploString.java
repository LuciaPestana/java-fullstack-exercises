package seccion03_string;

public class EjemploString
{
    public static void main(String[] args) {

        String curso= "Programación Java";

        String curso2 = new String("programación java");

        boolean esIgual = curso ==curso2; // compara la referencia en memoria, no el contenido de las cadenas
        System.out.println("esIgual2 = " + esIgual);

         esIgual = curso.equalsIgnoreCase(curso2); //compara el contenido de las cadenas, no la referencia en memoria
        System.out.println("¿Son iguales? " + esIgual);

        String curso3 = "Programación Java";

        esIgual = curso == curso3; // compara la referencia en memoria, no el contenido de las cadenas
        System.out.println("esIgual = " + esIgual);
        // curso3 no crea un objeto nuevo; Java busca en el String Pool,
        // ve que "Programación Java" ya existe y le asigna la misma referencia que a 'curso'.
        // Por eso (curso == curso3) es true: comparten la misma ubicación física.

    }
}
