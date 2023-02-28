package ClasesHijas;

import EjecicioTema4.SmartDevice;

public class SmartWatch extends SmartDevice {

    public String correa;
    public boolean contarPasos;
    public boolean responderMensajes;

    public SmartWatch() {}

    public SmartWatch(double pantalla, String modelo, String marca, String color, int bateria, double peso, String correa, boolean contarPasos, boolean responderMensajes) {
        super(pantalla, modelo, marca, color, bateria, peso);
        this.correa = correa;
        this.contarPasos = contarPasos;
        this.responderMensajes = responderMensajes;
    }

}
