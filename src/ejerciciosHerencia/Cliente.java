package ejerciciosHerencia;

public class Cliente extends Persona {

    private int clienteid;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteid) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteid = clienteid;
    }

    public int getClienteid() {
        return clienteid;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nclienteid=" + clienteid;

    }
}
