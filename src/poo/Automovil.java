package poo;

public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private String color ;
    private double cilindrada;
    private int capacidadEstanque = 40;

    private static int ultimoId;
    private static String colorPatente = "Naranja";
    private static int capacidadEstanqueEstatico=30;


    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_AZUL = "Azul";
    public static final String  COLOR_GRIS = "Gris";
    public static final String COLOR_AMARILLO = "Amarillo";



    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public static String getColorPatente() {
        return colorPatente;
    }
    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String detalle() {
        return  "El id de automovil es = " + this.id +
                "\nEl fabricante del automovil es = " + this.fabricante +
                "\nEl modelo es = " + this.modelo +
                "\nEl color es = " + color +
                "\nEl color patente es  = " + colorPatente +
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
    public static float calcularConsumoEstatico( int km, int porcentajeBencina){
        return km/(Automovil.capacidadEstanqueEstatico*porcentajeBencina/100f);
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(!(obj instanceof  Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return ( this.fabricante != null && this.modelo !=null &&
                this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }
    @Override
    public String toString() {
        return "Automovil{" +
                " id=' " + id + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }
}


