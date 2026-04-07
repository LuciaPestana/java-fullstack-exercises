package tareas;

/**
 * Clase ProgramaManejoDeNombres
 * Tarea del curso de Java de Andrés Guzmán.
 * * El objetivo es transformar 3 nombres recibidos por línea de comandos
 * tomando el segundo carácter en mayúscula, un punto y los dos últimos caracteres.
 */
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        try {

            // 1. Recibimos los nombres desde los argumentos de la línea de comandos (args)
            // Ejemplo de ejecución: java ProgramaManejoDeNombres Lucia Desiree Rafaela
            String nombre1 = args[0]; // Recibe "Lucia"
            String nombre2 = args[1]; // Recibe "Desiree"
            String nombre3 = args[2]; // Recibe "Rafaela"

            // 2. Transformación del primer nombre (Lucia -> U.ia)
            // Character.toUpperCase(nombre.charAt(1)) obtiene 'u' y la pasa a 'U'
            // nombre.substring(nombre.length() - 2) obtiene los últimos dos caracteres "ia"
            String resultado1 = Character.toUpperCase(nombre1.charAt(1)) + "."
                    + nombre1.substring(nombre1.length() - 2);

            // 3. Transformación del segundo nombre (Desiree -> E.ee)
            String resultado2 = Character.toUpperCase(nombre2.charAt(1)) + "."
                    + nombre2.substring(nombre2.length() - 2);

            // 4. Transformación del tercer nombre (Rafaela -> A.la)
            String resultado3 = Character.toUpperCase(nombre3.charAt(1)) + "."
                    + nombre3.substring(nombre3.length() - 2);

            // 5. Concatenamos los tres resultados en una única variable separada por guion bajo (_)
            // Tal como pide el enunciado de la tarea.
            String resultadoFinal = resultado1 + "_" + resultado2 + "_" + resultado3;

            // 6. Imprimimos el resultado final por consola
            // Salida esperada: U.ia_E.ee_A.la
            System.out.println(resultadoFinal);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Debes ingresar exactamente 3 nombres como argumentos.");}

        }
}
