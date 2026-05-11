package examen.interfaz;

import examen.modelo.BandaTransportadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainColecciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codigo;
        double velocidad, carga;
        List<BandaTransportadora> bandas = new ArrayList<BandaTransportadora>();

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
                    bandas.add(new BandaTransportadora(carga,codigo,velocidad));
                }break;
                case 2:{
                    //if(bandas.size() > 0)
                    if(!bandas.isEmpty())   {
                        System.out.print("Ingrese el codigo del motor que desea encender: ");
                        codigo = sc.nextLine();
                        boolean encontro = false;
                        for(int i = 0; i < bandas.size(); i++){
                            if(bandas.get(i).getCodigoBanda().equals(codigo)){
                                bandas.get(i).arrancaMotor();
                                encontro = true;
                                break;
                            }
                        }
                        if(!encontro)
                            System.out.println("El motor no existe");
                    }

                    else
                    {
                        System.out.println("Primero cree una banda");
                    }
                }break;
                case 3:{
                    if(!bandas.isEmpty()){
                        System.out.print("Ingrese el codigo del motor que desea modificar la velocidad: ");
                        codigo = sc.nextLine();
                        boolean encontro = false;
                        for(BandaTransportadora bt : bandas){
                            if(bt.getCodigoBanda().equals(codigo)){
                                System.out.print("Ingrese la velocidad: ");
                                velocidad = Double.parseDouble(sc.nextLine());
                                bt.ajustarVelocidad(velocidad);
                                System.out.println("La velocidad actual es: "+bt.getVelocidadRPM());
                                encontro = true;
                                break;
                            }
                        }
                        if(!encontro)
                            System.out.println("El motor no existe");
                    } else
                    {
                        System.out.println("Primero cree una banda");
                    }

                }break;
                case 4:{
                    if(!bandas.isEmpty()){
                        System.out.print("Ingrese el codigo del motor que desea verificar la carga: ");
                        codigo = sc.nextLine();
                        boolean encontro = false;
                        Iterator<BandaTransportadora> it = bandas.iterator();
                        while(it.hasNext()){
                            System.out.print("Ingrese la carga actual: ");
                            carga = Double.parseDouble(sc.nextLine());
                            it.next().verificarCarga(carga);
                            encontro = true;
                            break;
                        }
                        if(!encontro)
                            System.out.println("El motor no existe");

                    } else
                    {
                        System.out.println("Primero cree una banda");
                    }

                }break;
                case 5: {
                   /* if(bt != null){
                        System.out.println(bt);

                    } else
                    {
                        System.out.println("Primero cree una banda");
                    }*/
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
