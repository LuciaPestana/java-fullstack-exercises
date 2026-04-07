package seccion04_operadores;

import java.util.ArrayList;
import java.util.Scanner;

public class OperadoresLogicosLoginConArreglos {
    public static void main(String[] args) {


        String [] usarnames = new String[2];
        String [] passwords = new String[2];
        usarnames [0]= "Lucia";
        passwords [0]= "12345";

        usarnames [1] = "admin";
        passwords [1]= "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username " );

        String u = scanner.next();
        System.out.println("Ingrese el password " );
        String p = scanner.next();

        boolean esAutenticado = false;
        for (int i = 0; i< usarnames.length; i ++){
        if( (usarnames[i].equals(u) && passwords[i].equals(p)) ){
                esAutenticado = true;
                break;
        }

        }if(esAutenticado){
            System.out.println("Bienvenido usario " .concat(u).concat(" !"));

        }else {
            System.out.println("Lo siento, no se ha podido autenticar " );;

            main(args);
            return;
        }

    }
    
}
