package tareas;

import java.util.Scanner;

public class SistemasDeNotas
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notas [] = new double[20];
        double sumarMayor = 0;
        double sumarMenores = 0;
        double sumaTotal = 0;
        int incremtoMayor =0;
        int incremtoMenor = 0;
        int incremento = 0;
        int incremento1=0;
        double promedioMayor, promedioMenor, promedioTotal;

        for (int i = 0; i < notas.length; i++) {

            do {
                System.out.println("Introduce la nota numero " + (i + 1) + ":");
                notas[i] = scanner.nextDouble();
                if (notas[i] == 0) {
                    System.exit(0);
                }


                System.out.println("notas = " + notas[i]);
            } while (notas[i] > 7.00 || notas[i] < 1.00);
            if (notas[i] <= 7.00 || notas[i] >= 1.00) {
                incremento++;

                sumaTotal += notas[i];
            }

            if (notas[i] >= 5 && notas[i] <= 7.00) {
                sumarMayor += notas[i];
                incremtoMayor++;
            } if ( notas[i] >= 1 && notas[i] < 5  ){sumarMenores += notas[i];
                incremtoMenor++;
            }
            if( notas[i] == 1){
                incremento1++;
            }
        }
        if ( incremtoMayor !=0) {
            promedioMayor = sumarMayor / incremtoMayor;
        }         else {
            promedioMayor = 0;
        }
        if( incremtoMenor != 0){ promedioMenor = sumarMenores/incremtoMenor;
        } else {
            promedioMenor = 0;
        }
        promedioTotal = sumaTotal/ notas.length;
        System.out.println("El promedio de las notas menores a 5 es: " + promedioMenor);
        System.out.println("El promedio total de las notas es: " + promedioTotal);
        System.out.println("El promedio mayor es = " + promedioMayor);
        System.out.println("La cantidad de notas ingresadas es: " + incremento);
        System.out.println("La cantidad de notas iguales a 1 es: " + incremento1);

    }
}
