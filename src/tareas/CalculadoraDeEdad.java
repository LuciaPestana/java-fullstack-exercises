package tareas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalculadoraDeEdad {

    public static void main(String[] args) {

        Date fechaActual = new Date();
        System.out.println("fechaActual = " + fechaActual);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
        String fechaTexto = scanner.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;


        try {
            fechaNacimiento = formato.parse(fechaTexto);
        } catch (Exception e) {
            System.out.println("Formato de fecha incorrecto." );
            return;
        }
        Calendar calActual = Calendar.getInstance();
        calActual.setTime(fechaActual);

        Calendar calNacimiento = Calendar.getInstance();
        calNacimiento.setTime(fechaNacimiento);

        int anioNacimiento = calNacimiento.get(Calendar.YEAR);
        int mesNacimiento = calNacimiento.get(Calendar.MONTH);
        int diaNacimiento = calNacimiento.get(Calendar.DAY_OF_MONTH);

        int anioActual = calActual.get(Calendar.YEAR);
        int mesActual = calActual.get(Calendar.MONTH);
        int diaActual = calActual.get(Calendar.DAY_OF_MONTH);

        int edad = anioActual - anioNacimiento;

        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }

        System.out.printf("Usted tiene: " + edad + " años");
    }

}
