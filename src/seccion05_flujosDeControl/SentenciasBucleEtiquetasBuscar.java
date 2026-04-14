package seccion05_flujosDeControl;

public class SentenciasBucleEtiquetasBuscar {

    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";
        int maxPalabra = palabra.length();
        int max = frase.length() - maxPalabra;
        int cantida = 0;
        char letra= 'g';
        buscar:
        for(int i =0; i <= max; i++){
            int k= i;
            for(int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantida++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado  = " + cantida + " veces la palabra " + palabra + " en la frase");





    }



}
