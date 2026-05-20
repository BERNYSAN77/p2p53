package herencia.explicacion;

public class ClaseA {
    private int aA ;
    protected int bA ;

    public ClaseA(int aA, int bA){
        System.out.println("En constructor de ClaseA");
        setaA(aA);
        setbA(bA);
    }

    public int getaA() {
        return aA;
    }

    public void setaA(int aA) {
        if(aA > 0)
            this.aA = aA;
    }

    public int getbA() {
        return bA;
    }

    public void setbA(int bA) {
        if(bA > 0)
            this.bA = bA;
    }

    public void mostrarDatos(){
        System.out.println("aA: "+aA+"\nbA: "+bA);
    }
}
