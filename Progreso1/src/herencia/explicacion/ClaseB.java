package herencia.explicacion;

public class ClaseB extends ClaseA{
    private int aB;

    public ClaseB(int aA, int bA, int aB){
        super(aA, bA);
        System.out.println("Constructor de la ClaseB");
        this.aB = aB;

    }

    public int getaB() {
        return aB;
    }

    public void setaB(int aB) {
        this.aB = aB;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("aB: "+aB);
    }
}
