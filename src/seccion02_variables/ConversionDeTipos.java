package seccion02_variables;

public class ConversionDeTipos {
    public static void main(String[] args) {

        String numerStr = "100";
        int numeroInt = Integer.parseInt(numerStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-4";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        /*********
        * Conversiones de primitivos a String
         **********/

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        // Al ser dos Int puedes usar operador + y te suma los números, si usas el operador + con String, concatenará los valores

        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;

        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

/************************************************************************
* ------------------Conversiones entre primitivos -----------------------
 ***********************************************************************/

  int i = 12768;
  short s = (short) i; //(short) es un casteo
        // Sale error porque hay perdida de datos al ser menor por lo que se necesita un casteo explicito
        // es decir, forzar la conversion, pero al hacer esto se pierde información y el resultado no es el esperado,
        // por lo que se debe tener cuidado al hacer este tipo de conversiones
        System.out.println("s = " + s);
  long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);

        //Veamos ahora si se puede cambiar a un char o float

        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);







    }


}
