package seccion04_operadores;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        String variable = 7 == 7 ? "Verdadero" : "Falso";

        System.out.println("variable = " + variable);

        String estado = "";

        double promedio = 5.2;
        double matematica = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa la nota de matemaicas");
        matematica = s.nextDouble();
        System.out.println("Ingresa la nota de ciencias");
        ciencias = s.nextDouble();
        System.out.println("Ingresa la nota de historia");
        historia = s.nextDouble();
         promedio = (matematica + ciencias + historia)/ 3;
    estado = promedio >= 5.49 ? "Aprobado" : "Reprobado";

        System.out.println("estado = " + estado);


    }

}
