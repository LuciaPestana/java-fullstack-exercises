package seccion09;

import java.util.Map;

public class EjemploVariablesDeEntorno {

    public static void main(String[] args) {
        Map<String, String> variables = System.getenv();
        System.out.println("variables de ambiente del sistema = " + variables);


        String username = System.getenv("USERNAME");
        System.out.printf("username = %s%n", username);


        String javaHome = System.getenv("JAVA_HOME");
        System.out.printf("javaHome = %s%n", javaHome);
    }
}
