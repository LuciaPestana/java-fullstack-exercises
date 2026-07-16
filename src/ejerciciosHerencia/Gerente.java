package ejerciciosHerencia;

public class Gerente extends Empleado{

    private Double presupuesto;


    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empleadooId, Double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadooId);
        this.presupuesto = presupuesto;
    }
    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "\npresupuesto=" + presupuesto ;
    }
}
