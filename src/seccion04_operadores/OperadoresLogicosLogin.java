package seccion04_operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String usuario = "Lucia";
        String password = "12345";

        String usuario2 = "admin";
        String password2= "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username " );

        String u = scanner.next();
        System.out.println("Ingrese el password " );
        String p = scanner.next();

        boolean esAutenticado = false;

        if( (usuario.equals(u) && password.equals(p)) ||
                (usuario2.equals(u) && password2.equals(p)) ){
                 esAutenticado = true;
        } else {
            esAutenticado = false;
            System.out.println("Login incorrecto ");

        }if(esAutenticado){
            System.out.println("Bienvenido usario " .concat(u).concat(" !"));

        }else {
            System.out.println("Lo siento, no se ha podido autenticar " );;

            main(args);
            return;
        }




    }



}
