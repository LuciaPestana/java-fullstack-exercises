package seccion07_valor_referncia;

public class PasarPorReferencia {

    public static void main(String[] args) {
        int[] edad = {10, 11, 12};

        System.out.println("Iniciamos el metodo main con edad[0] = " + edad[0]);
        test(edad[0]);
        System.out.println("Finalizamos el metodo main con edad[0] = " + edad[0]);
    }

    public static void test (int i){

        System.out.println("Iniciamos el método test con i = " + i);
        i  = 35;
        System.out.println("Finalizo el método test con i = " + i);
    }

}
