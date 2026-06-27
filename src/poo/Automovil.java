package poo;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "azul";
    private double cilindrada;
    private int capacidadEstanque = 40;


    public String getFabricante(){
        return this.fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getCilindrada(){
        return this.cilindrada;

    }

    public void setCilindrada(double cilindrada ){
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque(){
        return this.capacidadEstanque;

    }
    public void setCapacidadEstanque(double cilindrada ){
        this.cilindrada = cilindrada;

    }











    public String detalle() {
        return "El fabricante del automovil es = " + this.fabricante +
                "\nEl modelo es = " + this.modelo +
                "\nEl color es = " + color +
                "\nLa cilindrada del auto es = " + cilindrada;

    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }
    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";

    }
    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo( int km, float porcentajeBencina){
        return km/(capacidadEstanque*porcentajeBencina);

    }

    public float calcularConsumo( int km, int porcentajeBencina){
        return km/(capacidadEstanque*porcentajeBencina/100f);

    }


}


