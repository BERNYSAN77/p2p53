package ejermotor.interfaz;

import ejermotor.negocio.Motor;

import java.util.Scanner;

public class MainArreglos {
    public static void main(String[] args) {
        Motor motores[];
        motores = new Motor[10];
        Scanner sc = new Scanner(System.in);
        int opc;
        int indice = 0;
        //Motor motores[] = new Motor[10];
        do{
            System.out.println("1. Agregar Motor");
            System.out.println("2. Prender");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:{
                    if(indice < motores.length){
                        motores[indice] = new Motor();
                        System.out.println("Motor "+(indice+1)+" ha sido creado");
                        indice++;
                    }

                }break;
                case 2:{
                    int motor;
                    System.out.println("Cuál motor desea prender del 1 al "+(indice)+": ");
                   //validación de que seleccione dentro del rango
                    motor = Integer.parseInt(sc.nextLine());
                    motores[motor-1].encender();



                }break;
            }

        }while(opc != 3);
    }
}
