package seccion05_flujosDeControl;

public class SentenciaIfElse {

    public static void main(String[] args) {
        float promedio = 5.8f;
        if (promedio >= 6.5) {
            System.out.println("El alumno aprobó la materia");
            
        }else if( promedio >= 6.0) {
            System.out.println("Muy buen promedio");
            
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
            
        } else  if ( promedio>=5.0){
            System.out.println("Regular, necesitas esforzarte un poco mas");
            
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesita estudiar más");

        } else {
            System.out.println("Reprobado, necesitas estudiar mucho más");
        }
        System.out.println(" tu promedio = " + promedio);
    }

}
