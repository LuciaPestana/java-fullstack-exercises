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







    }



}
