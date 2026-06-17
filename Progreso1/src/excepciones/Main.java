package excepciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre ="";
        int edad = 0;
        Scanner sc = new Scanner(System.in);
        try{
            try{
                System.out.print("Ingrese el nombre: ");
                nombre = sc.nextLine();
                System.out.print("Ingrese la edad: ");
                edad = Integer.parseInt(sc.nextLine());

            }catch(ArithmeticException nfe){
                System.out.println("Error en el ingreso de datos numericos");
            }finally{
                System.out.println("se liberan recursos dentro de finally");
            }
        }catch(Exception e){
            System.out.println("Error");
        }

        System.out.println("Bienvenido "+nombre+" su edad es "+edad);
        System.out.println("fuera del bloque try/catch");
    }
}
