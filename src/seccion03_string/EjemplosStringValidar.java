package seccion03_string;

public class EjemplosStringValidar {
    public static void main(String[] args) {


        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = "";

        }

        boolean esVacio = curso.length() == 0; //¿Cuántos caracteres tiene?
        System.out.println("esVacio = " + esVacio);
        
        boolean esVacio2 = curso.isEmpty(); //  ¿No tiene ningún carácter?
        System.out.println("esVacio2 = " + esVacio2); //

        boolean esBlanco = curso.isBlank(); // ¿No tiene nada útil (vacío o solo espacios)?

        System.out.println("esBlanco = " + esBlanco);

        if(!esVacio){
        System.out.println("Bienvenido al curso " + curso );
        System.out.println(curso.toUpperCase());
    }}
//En la práctica, isBlank() es el más útil para validar entradas de usuario,
// ya que alguien podría escribir solo espacios y técnicamente no estaría vacío para isEmpty()

}
//length()
//Devuelve el número de caracteres del String. No es un booleano, es un int
//"Hola".length()    // 4
//"".length()        // 0
//"   ".length()     // 3 (cuenta los espacios)


//isEmpty()
//Devuelve true solo si la longitud es exactamente 0.
//"Hola".isEmpty()   // false
//"".isEmpty()       // true
//"   ".isEmpty()    // false ← los espacios cuentan como caracteres

//isBlank()
//Devuelve true si está vacío o si solo contiene espacios en blanco. Disponible desde Java 11.

//"Hola".isBlank()   // false
//"".isBlank()       // true
//"   ".isBlank()    // true ← ignora los espacios