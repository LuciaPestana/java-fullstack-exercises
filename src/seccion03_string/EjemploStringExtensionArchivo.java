package seccion03_string;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        // Nombre de un archivo con su extensión
        String archivo = "alguna.imagen.pdf";

        // lastIndexOf(".") → Busca la posición del ÚLTIMO punto en el String
        // Esto nos permite encontrar donde empieza la extensión del archivo
        int i = archivo.lastIndexOf(".");

        // length() → Devuelve el total de caracteres: 17
        System.out.println("archivo.length() = " + archivo.length()); // 17

        // substring(i+1) → Extrae todo desde después del último punto hasta el final
        // i+1 para no incluir el punto en el resultado
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i + 1)); // pdf

    }
}
