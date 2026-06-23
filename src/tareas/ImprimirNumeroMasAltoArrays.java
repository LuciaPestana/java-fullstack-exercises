package tareas;

import java.util.Scanner;

public class ImprimirNumeroMasAltoArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[7];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero entre rango 11 a 99" + (i + 1) + ":");
            numeros[i] = scanner.nextInt();

            if (numeros[i] < 11 || numeros[i] > 99) {
                System.out.println("El numero ingresado no esta en el rango permitido");
                i--;
            }



        }
        int numeroMasAlto = numeros[0];
        for (int i = 1; i < numeros.length; i++){

        if (numeros[i] > numeroMasAlto){

            numeroMasAlto = numeros[i];
        }
        }

        System.out.println("El numero mas alto es: " + numeroMasAlto);

    }
}
