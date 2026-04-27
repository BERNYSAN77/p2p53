package examen.modelo;

public class BandaTransportadora {
    private String codigoBanda;
    private boolean motorActivo;
    private double velocidadRPM;
    private double cargaMaxima;

    public BandaTransportadora(double cargaMaxima, String codigoBanda, double velocidadRPM) {
        setCargaMaxima(cargaMaxima);
       ajustarVelocidad(velocidadRPM);
        this.codigoBanda = codigoBanda;
    }


    public String getCodigoBanda() {
        return codigoBanda;
    }

    public boolean isMotorActivo() {
        return motorActivo;
    }

    public double getVelocidadRPM() {
        return velocidadRPM;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCodigoBanda(String codigoBanda) {
        this.codigoBanda = codigoBanda;
    }

    private void setVelocidadRPM(double velocidadRPM) {
        if(velocidadRPM > 0 && velocidadRPM <= 3000)
            this.velocidadRPM = velocidadRPM;
    }

    public void setCargaMaxima(double cargaMaxima) {
        if(cargaMaxima > 0)
            this.cargaMaxima = cargaMaxima;
    }
    public void arrancaMotor(){
        if(!motorActivo){
            if(velocidadRPM > 0 && velocidadRPM < 1500)
                motorActivo = true;
            else
                System.out.println("La velocidad no es segura");
        }else
            System.out.println("el motor ya se encuentra prendido");
    }

    public void paradaEmergencia(){
        motorActivo = false;
        velocidadRPM = 0;
    }

    public void ajustarVelocidad(double nuevaVelocidad){
        if(!motorActivo){
            setVelocidadRPM(nuevaVelocidad);
        }
    }

    public void verificarCarga(double pesoActual){
        if(pesoActual > cargaMaxima){
            paradaEmergencia();
        }
    }

    @Override
    public String toString(){
        String estadoS = motorActivo?"Encendido":"Apagado";
        return "Código: "+codigoBanda+"\nEstado: "+estadoS+"\nVelocidad: "+velocidadRPM+
                "Carga máxima: "+cargaMaxima;
    }
}
