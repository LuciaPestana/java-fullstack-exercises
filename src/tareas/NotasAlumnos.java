package tareas;

import java.util.Scanner;

public class NotasAlumnos {

    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        int sumNotasMatematicas =0, sumNotasHistoria =0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];



        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese las notas de la clase de matematicas:  ");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = s.nextDouble();
        }

        System.out.println("Ingrese las notas de la clase de historia:  ");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextDouble();
        }
        System.out.println("Ingrese las notas de la clase de lenguaje:  ");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < 7; i++) {

            sumNotasMatematicas += claseMatematicas[i];
            sumNotasLenguaje += claseLenguaje[i];
            sumNotasHistoria += claseHistoria[i];
        }
        double promedioMatemicas = sumNotasMatematicas / claseMatematicas.length;
        double promedioHitoria = sumNotasHistoria / claseHistoria.length;
        double promedioLenguaje = sumNotasLenguaje/ claseLenguaje.length;
        System.out.println("Promedio clase matematicas: " + promedioMatemicas );
        System.out.println("Promedio clase historia: " + promedioHitoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);
        System.out.println("Promedio total del curso :" + (promedioMatemicas + promedioHitoria + promedioLenguaje) / 3);

        System.out.println("Ingrese el identificador del alumno(de 0 - 6) = ");

        int id = s.nextInt();
        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) / 3;
        System.out.println("Promedio del alumno con id " + id + " = " + promedioAlumno);

    }
}
