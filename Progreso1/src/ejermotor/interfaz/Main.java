package ejermotor.interfaz;

import ejermotor.negocio.Motor;

public class Main {
    public static void main(String[] args) {
        Motor v6 = new Motor();
        v6.mostrarEstado1();
        v6.encender();
        v6.encender();
        v6.ajustarVelocidad(50);
        v6.mostrarEstado();
        v6.ajustarVelocidad(230);
        v6.mostrarEstado();
    }
}