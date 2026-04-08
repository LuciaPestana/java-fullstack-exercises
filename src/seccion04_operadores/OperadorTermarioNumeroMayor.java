package seccion04_operadores;

import java.util.Scanner;

public class OperadorTermarioNumeroMayor {

    public static void main(String[] args) {


        int max = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el primer numero = " );
        int numero1 = s.nextInt();
        System.out.println("Introduce el segundo numero = ");
        int numero2 = s.nextInt();
        System.out.println("Introduce el tercer numero= " );
        int numero3 = s.nextInt();

        max = (numero1 > numero2) ? numero1: numero2;
        max = (max > numero3) ? max : numero3;

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);
        System.out.println("numero3 = " + numero3);

        System.out.println("El numero mayor es = " + max);




    }

}
