package tareas;

import java.util.Scanner;
import java.util.Arrays;
public class ProgramaManejoDeNombres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos nombre vamos a introducir?");
        int numeroNombres = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer después de leer un número
        String resultadosFinal = "";
        String[] nombres = new String[numeroNombres];

    for (int i=0; i<numeroNombres; i++ ){

        System.out.println("Introduce " +(i+1)+"  nombre = " );
            nombres[i] = sc.nextLine();

            System.out.println("El nombre introducido es: " + nombres[i] );

    }

        for (int i=0; i<numeroNombres; i++ ) {

          String  transformados =  Character.toUpperCase(nombres[i].charAt(1)) + "."
                    + nombres[i].substring(nombres[i].length() - 2);

            resultadosFinal += transformados;
            // 3. Añadimos el guion bajo SOLO si no es el último nombre
            if (i < numeroNombres - 1) {
                resultadosFinal += "_";
            }

        }
        System.out.println("Resultado: " + resultadosFinal);
    }


}
