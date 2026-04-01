package seccion02_variables;

public class variables001 {
    public static void main(String[] args) {
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase()); = " + saludar.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);
         boolean valor = true;
         int numero2 = 10;
         if(valor){
             System.out.println("numero = " + numero);

             numero2 = 15;

         }
        System.out.println("numero2 = " + numero2);
        var numero3 = "15";

        String nombre;
        nombre = "Andrés";
        if(numero > 10){
            nombre = "Pepe";

        }
        System.out.println("nombre = " + nombre);

        //Esto es comentario de prueba

        /*
        Este es un comentario de prueba
         */

    }

}
