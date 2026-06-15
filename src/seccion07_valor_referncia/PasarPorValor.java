package seccion07_valor_referncia;

public class PasarPorValor  {

    public static void main(String[] args) {
        int i = 10;

        System.out.println("Iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finalizamos el metodo main con i = " + i);
    }

    public static void test (int i){

        System.out.println("Iniciamos el método test con i = " + i);
        i  = 35;
        System.out.println("Finalizo el método test con i = " + i);
    }

}
