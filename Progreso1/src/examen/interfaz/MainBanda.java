package examen.interfaz;

import examen.modelo.BandaTransportadora;

import java.util.Scanner;

public class MainBanda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codigo;
        double velocidad, carga;
        BandaTransportadora bt = null;
        int opc;
        do{
            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:{
                    System.out.print("Ingrese el codigo: ");
                    codigo = sc.nextLine();
                    System.out.print("Ingrese la velocidad: ");
                    velocidad = Double.parseDouble(sc.nextLine());
                    System.out.print("Ingrese la carga máxima: ");
                    carga = Double.parseDouble(sc.nextLine());
                    bt = new BandaTransportadora(carga,codigo,velocidad);
                }break;
                case 2:{
                    if(bt != null)
                        bt.arrancaMotor();
                    else
                    {
                        System.out.println("Primero cree una banda");
                    }
                }break;
                case 3:{
                    if(bt != null){
                        System.out.print("Ingrese la velocidad: ");
                        velocidad = Double.parseDouble(sc.nextLine());
                        bt.ajustarVelocidad(velocidad);
                        System.out.println("La velocidad actual es: "+bt.getVelocidadRPM());

                    } else
                    {
                        System.out.println("Primero cree una banda");
                    }

                }break;
                case 4:{
                    if(bt != null){
                        System.out.print("Ingrese la carga actual: ");
                        carga = Double.parseDouble(sc.nextLine());
                        bt.verificarCarga(carga);

                    } else
                    {
                        System.out.println("Primero cree una banda");
                    }

                }break;
                case 5: {
                    if(bt != null){
                        System.out.println(bt);

                    } else
                    {
                        System.out.println("Primero cree una banda");
                    }
                }break;
                case 6:
                {
                    System.out.println("Gracias por usar nuestros servicios");
                }break;
                default:
                    System.out.println("No es una opción válida");

            }

        }while(opc != 6);





    }

    public static void menu(){
        System.out.println("1. Adiciona motor");
        System.out.println("2. Arrancar motor");
        System.out.println("3. Ajustar velocidad");
        System.out.println("4. Verificar carga");
        System.out.println("5. Reportar sistema");
        System.out.println("6. Salir");
        System.out.print("Ingrese una opción: ");
    }
}
