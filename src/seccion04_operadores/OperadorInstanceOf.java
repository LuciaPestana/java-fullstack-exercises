package seccion04_operadores;

public class OperadorInstanceOf {

    public static void main(String[] args) {

        // --- SECCIÓN 1: STRINGS ---
        String texto = "Creando un objeto de la clase String ... que tal!";

        // IMPORTANTE: Declaramos b1 como 'Boolean' (Clase) en lugar de 'boolean' (primitivo)
        // Esto permite que b1 pueda ser usado con el operador instanceof después.
        Boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);


        // --- SECCIÓN 2: ENTEROS (Integer) ---
        Integer num = 7;

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);


        // --- SECCIÓN 3: DECIMALES (Double) ---
        Double decimal = 45.54;

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);


        // --- SECCIÓN 4: EL ÚLTIMO BOOLEAN ---
        // Al ser b1 un objeto de la clase Boolean, esta línea ya no dará error.
        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);

    }
}