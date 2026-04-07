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
    }
}
