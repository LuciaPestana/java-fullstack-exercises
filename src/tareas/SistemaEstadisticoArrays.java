package tareas;

import java.util.Scanner;

public class SistemaEstadisticoArrays {

    public static void main(String[] args) {

        double numeros [] = new double[7];
        double sumaPositivos = 0;
        int contadorPositivos = 0;
        double sumaNegativos = 0;
        int contadorNegativos = 0;
        int contadorCero =0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos ++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                contadorCero++;
            }
        }
        if(contadorPositivos>0){
        double promedioPositivos = sumaPositivos/contadorPositivos;
        System.out.println("Promedio de numeros positivos: " + promedioPositivos);}
        else {
            System.out.println("No hay numeros positivos para calcular el promedio.");
        }
        if(contadorNegativos>0){

        double promedioNegativos = sumaNegativos/contadorNegativos;
        System.out.println("Promedio de numeros negativos: " + promedioNegativos);}
        else {
            System.out.println("No hay numeros negativos para calcular el promedio.");
        }

        System.out.println("Cantidad de ceros: " + contadorCero);
    }
}
