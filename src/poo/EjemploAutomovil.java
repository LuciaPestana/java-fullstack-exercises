package poo;

import java.util.Date;

public class EjemploAutomovil {

    public static void main(String[] args) {

            Date fecha = new Date();
            Automovil subaru = new Automovil( "Subaro", "Impreza", Automovil.COLOR_GRIS, 2.0, 50);
            Automovil mazda = new Automovil( "Mazda", "BT-50", Automovil.COLOR_ROJO, 3.0, 60);
            Automovil nissan = new Automovil("Nissan", "Navara", Automovil.COLOR_AZUL, 3.5, 70);
            Automovil nissan2 = new Automovil("Nissan", "Navara", Automovil.COLOR_BLANCO, 3.5, 70);
            Automovil auto = new Automovil();
        System.out.println(auto.equals(fecha));

        System.out.println("¿Son iguales ?  " + (nissan2 == nissan));
        System.out.println("¿Son iguales ?  " + (nissan2.equals(nissan)));
        System.out.println("¿Son iguales ?  " + auto.equals(nissan));

        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.detalle());
        System.out.println();
        System.out.println(mazda.detalle());

        System.out.println(mazda.acelerar(3000));
        System.out.println();
        System.out.println(subaru.acelerar(4000));
        System.out.println(mazda.frenar());
        System.out.println();
        System.out.println(subaru.frenar());


        System.out.println(mazda.acelerarFrenar(5000));

        System.out.println(" kilometraje por libros = " + subaru.calcularConsumo(300, 0.75f));

        System.out.println(" kilometraje por libros = " + subaru.calcularConsumo(300, 75));


    }

}
