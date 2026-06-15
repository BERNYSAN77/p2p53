package excepciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Ingrese el nombre: ");
            nombre = sc.nextLine();
            System.out.print("Ingrese la edad: ");
            edad = Integer.parseInt(sc.nextLine());
            System.out.println("Bienvenido "+nombre+" su edad es "+edad);
        }catch(NumberFormatException nfe){
            System.out.println("Error en el ingreso de datos numericos");
        }finally{
            System.out.println("se liberan recursos dentro de finally");
        }
        System.out.println("fuera del bloque try/catch");
    }
}
