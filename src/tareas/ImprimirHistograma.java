package tareas;

import java.util.Arrays;
import java.util.Scanner;

public class ImprimirHistograma {

    public static void main(String[] args) {

        int histograma [] = new int[12];
        int[] numerosDelHistograma = new int[]{1, 2, 3, 4, 5, 6};

        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < histograma.length; i++) {
            System.out.println("Ingrese el numeros enteros del 1 al 6 " + (i + 1) + ":");
            histograma[i] = scanner.nextInt();

            if (histograma[i] < 1 || histograma[i] > 6) {
                System.out.println("El numero ingresado no esta en el rango permitido");
                i--;
            }
        }
        for (int i = 0; i < numerosDelHistograma.length; i++) {
            contador = 0;
            for (int j = 0; j < histograma.length; j++) {
                if (histograma[j] == numerosDelHistograma[i]) {
                    contador++;
                }
            }
            System.out.println((numerosDelHistograma[i]) + " : " + "*".repeat(contador));

        }



    }



}
