package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IAnimal>animales = new ArrayList<IAnimal>();

    }
    public static void menu(){
        System.out.println("1. Ingrese perro");
        System.out.println("2. Ingrese gato");
        System.out.println("3. Mostrar lista");
        System.out.println("4. Mostrar perros");
        System.out.println("5. Mostrar gatos");
        System.out.println("6. Salir");
    }
}
