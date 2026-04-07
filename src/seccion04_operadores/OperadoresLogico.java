package seccion04_operadores;

/**
 * Clase OperadoresLogico
 * Demostración de operadores AND (&&) y OR (||) con precedencia de paréntesis.
 * Parte de la formación de 1º DAM y el curso de Andrés Guzmán.
 */
public class OperadoresLogico {
    public static void main(String[] args) {

        // Declaración de variables con distintos tipos de datos (int, byte, float, double)
        int i = 3;
        byte j = 3;
        float k = 127e-7f; // Notación científica: 0.0000127
        double l = 2.1416e3; // Notación científica: 2141.6
        boolean m = false;

        /* * OPERADOR AND (&&) - "Cortocircuito"
         * Evalúa que TODAS las condiciones sean verdaderas.
         * Si encuentra una falsa, deja de evaluar el resto (eficiencia).
         */
        boolean b1 = i == j && k < l && m == false;
        // true && true && true => b1 = true
        System.out.println("b1 = " + b1);

        /* * OPERADOR OR (||)
         * El resultado es verdadero si al menos UNA de las condiciones se cumple.
         */
        boolean b2 = i == j || k > l;
        // true || false => b2 = true
        System.out.println("b2 = " + b2);

        /* * USO DE PARÉNTESIS Y PRECEDENCIA
         * Los paréntesis obligan a Java a evaluar primero lo que hay dentro.
         */
        boolean b3 = i == j && (k < l || m == true);
        // Evalúa primero: (true || false) => true
        // Luego: i == j (true) && resultado anterior (true) => b3 = true
        System.out.println("b3 = " + b3);

        // b4: Uso de paréntesis para agrupar el OR (||) antes que el AND (&&)
        // (true || true) es true. Luego true && false (m es false) resulta en false.
        boolean b4 = (i == j || k < l) && m == true;
        System.out.println("b4 = " + b4);

        // b5: Evaluación directa con valores booleanos
        // (true || true) es true. true && false resulta en false.
        boolean b5 = (true || true) && false;
        System.out.println("b5 = " + b5);

        /* b6: Sin paréntesis, la precedencia manda.
           En Java, el AND (&&) se evalúa ANTES que el OR (||).
           1. false && false = false
           2. true || false || false = true
        */
        boolean b6 = true || false && false || false; // Resultado: true
        System.out.println("b6 = " + b6);

        /* b7: Con paréntesis cambiamos el orden natural.
           1. (true || false) = true
           2. (true && false) = false
           3. false || false = false
        */
        boolean b7 = ((true || false) && false) || false; // Resultado: false
        System.out.println("b7 = " + b7);


    }

}
