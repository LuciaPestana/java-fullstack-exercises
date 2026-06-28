package poo;

import java.util.Date;

public class EjemploAutomovilStatic {

    public static void main(String[] args) {

            Date fecha = new Date();
            Automovil subaru = new Automovil( "Subaro", "Impreza", "blanco", 2.0, 50);
            Automovil mazda = new Automovil( "Mazda", "BT-50", "Rojo", 3.0, 60);
            Automovil nissan = new Automovil("Nissan", "Navara", "Gris", 3.5, 70);
            Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris", 3.5, 70);
            Automovil auto = new Automovil();

            Automovil.setColorPatente("Verde");
            Automovil.setCapacidadEstanqueEstatico(45);
        System.out.println("Automovil.getColorPatente()); = " + Automovil.getColorPatente());

        System.out.println(nissan.detalle());
        System.out.println(nissan.toString());

        System.out.println(subaru.detalle());
        System.out.println();
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(nissan2.detalle());

        System.out.println("Automovil.calcularConsumoEstatico(300, 75)); = " + Automovil.calcularConsumoEstatico(300, 75));




    }

}
