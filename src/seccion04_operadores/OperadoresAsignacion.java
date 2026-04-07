package seccion04_operadores;

public class OperadoresAsignacion {

    public static void main(String[] args) {
        int i = 5, j = 10;
        i += j; // i = i + j
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        i += 5; // i = i + 5
        System.out.println("i = " + i);

        i-= 2; // i = i -2
        System.out.println("i = " + i);

        i *=3; // i = i * 3;
        System.out.println("i = " + i);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre = 'Andres'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);

    }


}
