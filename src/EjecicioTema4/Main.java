package EjecicioTema4;

import ClasesHijas.SmartPhone;
import ClasesHijas.SmartWatch;

public class Main {
    public static void main(String[] args) {

    SmartPhone iphone = new SmartPhone(6.5, "14 pro Max", "apple","white", 5000, 203.2,"5G", true,true, true);
        System.out.println("tamaño de pantalla: " + iphone.pantalla);
        System.out.println("modelo: " + iphone.modelo);
        System.out.println("color: " + iphone.color);
        System.out.println("marca: " + iphone.marca);
        System.out.println("capacidad de bateria: " + iphone.bateria);
        System.out.println("peso en gramos: " + iphone.peso);
        System.out.println("coneccion: " + iphone.Coneccion);
        System.out.println("resistencia al agua: " + iphone.resistenciaAlAgua);
        System.out.println("radio: " + iphone.radio);
        System.out.println("bluettoth: " + iphone.bluetooth);

    SmartWatch appleWatch = new SmartWatch(3.4, "AppleWatch 7", "apple", "gray", 3000, 80, "plastica", true,true);
        System.out.println("tamaño de pantalla: " + appleWatch.pantalla);
        System.out.println("modelo: " + appleWatch.modelo);
        System.out.println("color: " + appleWatch.color);
        System.out.println("marca: " + appleWatch.marca);
        System.out.println("capacidad de bateria: " + appleWatch.bateria);
        System.out.println("peso en gramos: " + appleWatch.peso);
        System.out.println("correa: " + appleWatch.correa);
        System.out.println("contador de pasos: " + appleWatch.contarPasos);
        System.out.println("responder mensajes: " + appleWatch.responderMensajes);



    }
}