package seccion05_flujosDeControl;

public class SentenciaForEach {

    public static void main(String[] args) {

        int[] numeros = {1, 3, 4 , 7 ,  11 ,  17,  19,  23,  27,  29};


        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }

        String [] nombres ={ "Andres" , "Maria" ,  "Juan" ,  "Karla" ,  "Sofia" ,  "Juana" ,  "Pepa"};

        for(String nombre : nombres){

            System.out.println("nombre = " + nombre);
        }






    }




}
