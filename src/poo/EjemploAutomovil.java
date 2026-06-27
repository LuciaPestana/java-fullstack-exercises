package poo;

public class EjemploAutomovil {

    public static void main(String[] args) {


        Automovil subaru = new Automovil();

        subaru.setFabricante("Subaro");
        subaru.setModelo("Impreza");
        subaru.setColor("blanco");
        subaru.setCilindrada(2.0);



        Automovil mazda = new Automovil();
        mazda.setFabricante("Toyota");
        mazda.setModelo("Corolla");
        mazda.setColor("Azul");
        mazda.setCilindrada(3.0);
        System.out.println();

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
