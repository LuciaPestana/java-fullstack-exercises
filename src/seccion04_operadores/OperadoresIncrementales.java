package seccion04_operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre incremento
        int i = 1;
        int j = ++i; // i= i +1;

        System.out.println("j = " + j);
        System.out.println("i = " + i);

        // Post incremento
        i = 2;
        System.out.println("valor inicial de i = " + i);
        j = i++; // j = i; i = i + 1;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        // Pre decremento

        i= 3;
        j = --i; // i = i - 1; j = i;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        // Post decremento

        i = 4;
        j = i --;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        System.out.println("j = " +(++j));
        System.out.println("j = " + (j++));

        System.out.println("j = " + j);

        /*
         * RESUMEN: OPERADORES DE INCREMENTO
         * * +------------------+-------------+---------------------------------------+
         * | Tipo             | Sintaxis    | ¿Qué ocurre?                          |
         * +------------------+-------------+---------------------------------------+
         * | Post-incremento  | j = i++;    | Se asigna el valor, LUEGO aumenta i.  |
         * | Pre-incremento   | j = ++i;    | Se aumenta i, LUEGO se asigna a j.    |
         * +------------------+-------------+---------------------------------------+
         * * Ejemplo Post-incremento (i=2):
         * j = i++; -> j valdrá 2, i valdrá 3.
         * * Ejemplo Pre-incremento (i=2):
         * j = ++i; -> j valdrá 3, i valdrá 3.
         */
        
        
        
        
        
        



    }

}
