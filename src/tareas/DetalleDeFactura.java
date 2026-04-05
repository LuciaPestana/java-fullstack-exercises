package tareas;
import java.util.Scanner;
public class DetalleDeFactura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de la factura "  );
        String nombreFactura = sc.nextLine();
        System.out.println("Factura = " + nombreFactura);


        double precioPrimerProducto = 0;
        double precioSegundoProducto= 0;
        try {
            System.out.println("Introduce el precio primer producto" );
             precioPrimerProducto = sc.nextDouble();

        }catch (Exception e) {
            System.out.println("Error al introducir el precio, por favor introduce un número válido");
            sc.next();
            main(args);
            System.exit(0);
        }
        try {
            System.out.println("Introduce el precio del segundo producto");
             precioSegundoProducto = sc.nextDouble();
        }
        catch (Exception e) {;
            System.out.println("Error al introducir el precio, por favor introduce un número válido");
            sc.next();
            main(args);
            System.exit(0);
        }

        double precioAntesDeImpuestos = precioPrimerProducto + precioSegundoProducto;
        System.out.println("Precio antes de impuestos = " + precioAntesDeImpuestos);
        double valorImpuesto = precioAntesDeImpuestos * 19/100;
        System.out.println("Impuestos = " + valorImpuesto);
        double totalFactura = precioAntesDeImpuestos + valorImpuesto;
        System.out.println("La factura " + nombreFactura +

                "\n" + "Tiene un impuesto de: " +valorImpuesto +
                "\n" + "Y su total es de: " +totalFactura);

    }

}
