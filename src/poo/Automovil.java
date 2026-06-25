package poo;

public class Automovil {

    String fabricante;
    String modelo;
    String color = "azul";
    double cilindrada;

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("El fabricante del automovil es = " + this.fabricante);
        sb.append("\nEl modelo es = " + this.modelo);
        sb.append("\nEl color es = " + color);
        sb.append("\nLa cilindrada del auto es = " + cilindrada);
        return sb.toString();

    }



}
