package herencia.explicacion;

public class Main {
    public static void main(String[] args) {
        ClaseC c = new ClaseC(-1,-2,3,4);
        c.mostrarDatos();
        c.setaA(-5);
        System.out.println("aA: "+c.getaA());
        c.bA = -200;
        System.out.println("bA: "+c.getbA());
    }
}
