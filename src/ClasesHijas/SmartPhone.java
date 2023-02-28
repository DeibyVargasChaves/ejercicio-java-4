package ClasesHijas;

import EjecicioTema4.SmartDevice;

public class SmartPhone extends SmartDevice {

    public String Coneccion;
    public boolean resistenciaAlAgua;
    public boolean radio;
    public boolean bluetooth;

    public SmartPhone() {
    }

    public SmartPhone(double pantalla, String modelo, String marca, String color, int bateria, double peso, String coneccion, boolean resistenciaAlAgua, boolean radio, boolean bluetooth) {
        super(pantalla, modelo, marca, color, bateria, peso);
        this.Coneccion = coneccion;
        this.resistenciaAlAgua = resistenciaAlAgua;
        this.radio = radio;
        this.bluetooth = bluetooth;
    }
}
