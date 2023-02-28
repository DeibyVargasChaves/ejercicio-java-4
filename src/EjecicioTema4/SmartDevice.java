package EjecicioTema4;

public class SmartDevice {

    protected double pantalla;
    protected String modelo;
    protected String marca;
    protected String color;
    protected int bateria;
    protected double peso;
    public SmartDevice(){
    }

    public SmartDevice(double pantalla, String modelo, String marca, String color, int bateria, double peso) {
        this.pantalla = pantalla;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.bateria = bateria;
        this.peso = peso;
    }

}
