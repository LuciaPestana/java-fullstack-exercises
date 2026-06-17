package seccion09;

import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        String usermane = System.getProperty("user.name");
        System.out.printf("Nombre del usuario: %s%n", usermane);

        String home = System.getProperty("user.home");
        System.out.printf("Home del usuario: %s%n", home);

            String workspace = System.getProperty("user.dir");
        System.out.printf("Directorio de trabajo: %s%n", workspace);

        String java = System.getProperty("java.version");
        System.out.printf("Version de java: %s%n", java);

        Properties p = System.getProperties();
        p.list(System.out);
    }

}
