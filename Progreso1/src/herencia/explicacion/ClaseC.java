package herencia.explicacion;

public class ClaseC extends ClaseB{
    private int aC;
    public ClaseC(int aA, int bA, int aB, int aC){
        super(aA,bA,aB);
        this.aC = aC;
        System.out.println("Constructor de la ClaseC");
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("aC: "+aC);
    }
}
