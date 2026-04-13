package seccion05_flujosDeControl;

import java.util.Scanner;

public class SentenciaSwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Ingrese un numero del 0 al 3: ");
        int num = sc.nextInt();
        switch ( num){

            case 0:
                System.out.println("El hum es cero");
                break;
            case 1:
                System.out.println("El num es uno");
                break;

            case 2:
                System.out.println("El num es dos");
                break;
            case 3:
                System.out.println("El num es tres");
                break;

            default:
                System.out.println("Numero desconocido");

        }

        System.out.println( "Ingrese un nombre: ");
        String nombre = sc.next();


        switch(nombre){

            case "andres":
                System.out.println("Hola Andres");
                break;
            case "maria":
                System.out.println("Hola Maria");
                break;

            case "juan":
                System.out.println("Hola Juan");
                break;
            case "ana":
                System.out.println("Hola Ana");
                break;

            default:
                System.out.println("Nombre desconocido");









        }



    }


}
