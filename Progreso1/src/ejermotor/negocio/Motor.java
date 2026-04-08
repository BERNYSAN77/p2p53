package ejermotor.negocio;

public class Motor {
    private boolean estado;
    private int velocidad;

    //  y
    //mostrarEstado()

    public void encender() {
        if (estado) {
            System.out.println("Motor ya se encuentra encedido");
        } else {
            estado = true;
        }
    }

    public void apagar() {
        if (estado) {
            estado = false;
            velocidad = 0;
        } else {
            System.out.println("Motor ya se encuentra apagado");
        }
    }


    public void ajustarVelocidad(int nuevaVelocidad) {
        if (nuevaVelocidad <= 100 && nuevaVelocidad > 0) {
            velocidad = nuevaVelocidad;
        }else
            System.out.println("la velocidad no es un valor válido");
    }

    public void mostrarEstado(){
        if (estado) {
            System.out.println("El motor se encuentra encedido y su velocida es: "+velocidad);
        } else {
            System.out.println("El motor se encuentra apagado");
        }
    }

    public void mostrarEstado1(){
        String valEstado = estado?"encendido":"apagado";
        System.out.println("El motor se encuentra "+valEstado+" y su velocidad es "+velocidad);
    }

}