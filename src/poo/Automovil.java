package poo;

public class Automovil {

    String fabricante;
    String modelo;
    String color = "azul";
    double cilindrada;

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

}


