package poo;

public class EjemploAutomovil {

    public static void main(String[] args) {


        Automovil subaru = new Automovil();

        subaru.fabricante = "Subaro";
        subaru.modelo = "Impreza";
        subaru.color= "blanco";
        subaru.cilindrada = 2.0;



        Automovil mazda = new Automovil();
        mazda.fabricante = "Toyota";
        mazda.modelo = "Corolla";
        mazda.color = "Azul";
        mazda.cilindrada = 3.0;
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




    }

}
