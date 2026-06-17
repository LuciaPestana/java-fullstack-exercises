package seccion09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) throws IOException {

        FileInputStream archivo = new FileInputStream("src/seccion09/config.properties");

        Properties p = new Properties(System.getProperties());
        p.load(archivo);

        p.setProperty("mi.propiedad.personalizada", "Algún valor personal");
        System.setProperties(p);
        System.getProperties().list(System.out);   
    }

}
