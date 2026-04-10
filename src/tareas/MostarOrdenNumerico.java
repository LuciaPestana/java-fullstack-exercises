package tareas;

import java.util.Scanner;

public class MostarOrdenNumerico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        try {
                int numero1 = sc.nextInt();


        System.out.println("Ingrese el segundo número: " );
        int numero2 = sc.nextInt();




       int numMayor = numero1 > numero2 ? numero1 : numero2;

       int numMenor = numero1 < numero2 ? numero1 : numero2;


        System.out.println("El numero mayor es = " + numMayor + " Y el numero menor es = " + numMenor );


        sc.close();
        } catch (Exception e) {
            System.out.println("Error al introducir el número, por favor introduce un número válido");
            sc.next();
            main(args);
            System.exit(0);
        }
    }



}
