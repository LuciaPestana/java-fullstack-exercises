package tareas;

import java.util.Scanner;

public class OrdenarArrays {


    public static void main(String[] args) {

        int numeros [] = new int[10];
        int ultimo = numeros.length - 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < (numeros.length)/2; i++) {

            System.out.println(  + numeros[ultimo] + " - " + numeros[i]  );
            ultimo--;

        }


   scanner.close();




    }
}
