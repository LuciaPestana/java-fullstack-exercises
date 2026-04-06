package seccion03_string;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        // ============================================================
        // MÉTODOS DE STRING EN JAVA
        // Un String es una cadena de caracteres inmutable (no se modifica)
        // ============================================================

        String nombre = "Lucía";

        // length() → Devuelve el número de caracteres del String
        System.out.println("nombre.length() = " + nombre.length()); // 5

        // toUpperCase() → Convierte todos los caracteres a MAYÚSCULAS
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // LUCÍA

        // toLowerCase() → Convierte todos los caracteres a minúsculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // lucía

        // equals() → Compara dos Strings exactamente (distingue mayúsculas/minúsculas)
        System.out.println("nombre.equals(\"Lucía\") = " + nombre.equals("Lucía")); // true
        System.out.println("nombre.equals(\"lucía\") = " + nombre.equals("lucía")); // false

        // equalsIgnoreCase() → Compara dos Strings ignorando mayúsculas/minúsculas
        System.out.println("nombre.equalsIgnoreCase(\"lucía\") = " + nombre.equalsIgnoreCase("lucía")); // true

        // compareTo() → Compara alfabéticamente:
        //   0  → son iguales
        //   positivo → el String actual va DESPUÉS en el alfabeto
        //   negativo → el String actual va ANTES en el alfabeto
        System.out.println("nombre.compareTo(\"Lucía\") = " + nombre.compareTo("Lucía")); // 0
        System.out.println("nombre.compareTo(\"Ana\") = " + nombre.compareTo("Ana"));     // positivo (L > A)

        // charAt(index) → Devuelve el carácter en la posición indicada (empieza en 0)
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));                      // L
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));                      // u
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1)); // a (último)

        // substring(inicio) → Extrae el String desde el índice indicado hasta el final
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // ucía

        // substring(inicio, fin) → Extrae desde 'inicio' hasta 'fin - 1' (fin no incluido)
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4)); // ucí

        // substring con length()-1 → Obtiene solo el último carácter
        System.out.println("nombre.substring(nombre.length() - 1) = " + nombre.substring(nombre.length() - 1)); // a

        // ============================================================
        // MÉTODOS DE BÚSQUEDA Y REEMPLAZO
        // ============================================================

        String trabalenguas = "trabalenguas";

        // replace(viejo, nuevo) → Reemplaza todas las ocurrencias
        // OJO: No modifica el original, los Strings son INMUTABLES
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a", ".")); // tr.b.lengu.s
        System.out.println("trabalenguas original = " + trabalenguas); // trabalenguas (sin cambios)

        // indexOf(char) → Devuelve la posición de la PRIMERA ocurrencia (-1 si no existe)
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); // 2

        // lastIndexOf(char) → Devuelve la posición de la ÚLTIMA ocurrencia
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // 10

        // indexOf(String) → Busca la posición donde empieza una subcadena
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas")); // 5

        // contains(String) → Devuelve true si contiene la subcadena indicada
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas")); // true

        // startsWith(String) → Devuelve true si el String empieza con el valor indicado
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr")); // true

        // endsWith(String) → Devuelve true si el String termina con el valor indicado
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s")); // true

        // ============================================================
        // TRIM → Elimina los espacios en blanco al inicio y al final
        // ============================================================
        System.out.println("  trabalenguas  ");          // con espacios
        System.out.println("  trabalenguas  ".trim());   // sin espacios → trabalenguas

    }
}
