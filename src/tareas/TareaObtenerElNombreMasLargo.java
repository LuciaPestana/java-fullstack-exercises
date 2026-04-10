package tareas;

import javax.swing.*;


public class TareaObtenerElNombreMasLargo {

    public static void main(String[] args) {
        String [] nombresapellidos = new String[3];
        String [] nombre = new String[3];

     nombresapellidos[0] = JOptionPane.showInputDialog("Ingrese el primer nombre y apellido: ");
        System.out.println("nombre = " + nombresapellidos[0]);

        nombre[0] = nombresapellidos[0].split(" ")[0];
        System.out.println("nombre = " + nombre[0]);

    nombresapellidos[1] = JOptionPane.showInputDialog("Ingrese el segundo nombre y apellido: ");
        System.out.println("nombre = " + nombresapellidos[1]);
        nombre[1] = nombresapellidos[1].split(" ")[0];
        System.out.println("nombre2 = " + nombre[1]);

    nombresapellidos[2] = JOptionPane.showInputDialog("Ingrese el tercer nombre y apellido: ");
        System.out.println("nombre3 = " + nombresapellidos[2]);
        nombre[2] = nombresapellidos[2].split(" ")[0];
        System.out.println("nombre3 = " + nombre[2]);

        String primerganador =  nombre[0].length() > nombre[1].length() ? nombresapellidos[0] : nombresapellidos[1];
         String ganador = primerganador.split(" ")[0].length() > nombre[2].length() ? primerganador : nombresapellidos[2];

         System.out.println( ganador + " tiene el nombre más largo");


    }

}
