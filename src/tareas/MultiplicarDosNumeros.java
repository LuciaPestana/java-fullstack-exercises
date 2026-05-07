package tareas;

import java.util.Scanner;

public class MultiplicarDosNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero = " );

        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero = " );
        int num2 = scanner.nextInt();
        int valorAb = Math.abs(num2);

        int resultadofinal = 0;
        int resultado = 0;

        for(int i =0; i < valorAb; i++){

            resultado += num1;
        }
        if(num2 < 0){

            resultado = -resultado;
        }
        System.out.println("resultado = " + resultado);

    }

}
