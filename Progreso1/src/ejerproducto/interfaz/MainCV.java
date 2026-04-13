package ejerproducto.interfaz;

import ejerproducto.negocio.Producto;

import java.util.Scanner;

public class MainCV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        Producto p1 = new Producto("esfero",1.25,20);
        System.out.println("********Datos del producto********\n"+p1);
        do{
            System.out.println("1. Comprar");
            System.out.println("2. Vender");
            System.out.println("3. Mostrar producto");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:{
                    int cantidad;
                    System.out.print("Ingrese la cantidad de producto a ser reabastecido: ");
                    cantidad = Integer.parseInt(sc.nextLine());
                    p1.comprar(cantidad);

                }break;
                case 2:{
                    int vender;
                    double precio;
                    System.out.print("Ingrese la cantidad para vender: ");
                    vender = Integer.parseInt(sc.nextLine());
                    precio = p1.vender(vender);
                    if ( precio == 0){
                        System.out.println("no se pudo realizar la venta");
                    }else
                        System.out.println("El valor a pagar es:" +precio);
                }break;
                case 3:{
                    System.out.println(p1);
                }break;
                case 4: {
                    System.out.println("Gracias por usar nuestro programa");

                }break;
                default:
                    System.out.println("Opción incorrecta");
            }

        }while(opc != 4);
    }
}
