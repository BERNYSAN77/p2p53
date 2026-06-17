package excepciones;

import java.util.Scanner;

public class MainThrow {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int adivina;
        System.out.println("Ingrese un número entre 1 y 10");
        adivina = Integer.parseInt(sc.nextLine());
        if(adivina == 7){
            throw new Exception("Ingresó el número prohibido");
        }
    }
}
