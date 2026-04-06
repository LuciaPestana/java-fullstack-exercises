package seccion03_string;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";

        /* 1. MÉTODO toCharArray()
         Convierte el String en un arreglo de tipo char[].
         Nota: Si haces print directo del método, verás una referencia de memoria, no el contenido.
        */
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length; // .length en arreglos es un atributo, no un método (no lleva paréntesis)

        // Recorremos el arreglo de caracteres uno a uno
        for (int i = 0; i < largo; i++){
            System.out.println("carácter en índice " + i + " = " + arreglo[i]);
        }

        System.out.println("\n--- Uso de split ---");

        /* 2. MÉTODO split(separador)
         Divide el String en un arreglo de Strings (String[]) basándose en un patrón.
        */
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a"); // Corta el texto cada vez que encuentra una 'a'
        int l = arreglo2.length;
        for (int j = 0; j < l; j++){
            System.out.println("Parte " + j + ": " + arreglo2[j]);
        }

        /* 3. EL CASO ESPECIAL DEL PUNTO (.)
         El método split utiliza "Expresiones Regulares" (RegEx).
         En RegEx, el punto (.) significa "cualquier carácter".
         Para que Java entienda que queremos el punto literal, usamos doble barra: "\\."
        */
        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\."); // Escapamos el punto literal

        l = archivoArr.length;
        for (int j = 0; j < l; j++){
            System.out.println("Segmento de archivo: " + archivoArr[j]);
        }

        /* 4. OBTENER LA EXTENSIÓN
         Como los arreglos empiezan en 0, el último elemento siempre es largo - 1.
        */
        System.out.println("Extensión del archivo = " + archivoArr[l - 1]);
    }
}