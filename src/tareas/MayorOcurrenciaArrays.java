package tareas;

import java.util.Scanner;

public class MayorOcurrenciaArrays {

    public static void main(String[] args) {

        int numeros [] = new int[10];
        int numeroMayorOcurrencia = 0;
        int  elementoMasRetido = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero del 1 al 9 :" );
            numeros[i] = scanner.nextInt();
        if (numeros[i] < 1 || numeros[i] > 9) {
                System.out.println("El numero ingresado no esta en el rango permitido");
                i--;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }
         if(contador > numeroMayorOcurrencia){
               numeroMayorOcurrencia = contador;
              elementoMasRetido = numeros[i];
         }
        }
        System.out.println("La mayor ocurrencia es: " + numeroMayorOcurrencia);
        System.out.println("El elemento que mas se repite es: " + elementoMasRetido);

    }
}
