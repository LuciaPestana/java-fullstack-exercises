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






    }

}
