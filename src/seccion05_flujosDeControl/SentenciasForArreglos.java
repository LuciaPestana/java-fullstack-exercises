package seccion05_flujosDeControl;

import javax.swing.*;

public class SentenciasForArreglos {
    public static void main(String[] args) {

        String[] nombres = { "Juan", "Karla", "Pedro", "Maria", "Sofia", "Juana", "Pepa" };

        int count = nombres.length;

        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("pedro") ||
            nombres[i].equalsIgnoreCase("sofia")
            ){
                continue;
            }

            System.out.println(i + ".- " + nombres[i]);

        }

        String buscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar: ");
        System.out.println("buscar = " + buscar);


        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }


        }
              if(encontrado){
                        JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");

              } else {

                  JOptionPane.showMessageDialog(null, buscar + " no exite en el sistema");

              }

    }

}
