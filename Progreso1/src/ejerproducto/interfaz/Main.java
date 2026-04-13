package ejerproducto.interfaz;

import ejerproducto.negocio.Producto;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("esfero",1.25,20);
        System.out.println("Nombre del objeto p1: "+p1.getNombre());
        System.out.println("Precio del objeto p1: "+p1.getPrecio());
        System.out.println("Stock del objeto p1: "+p1.getStock());

        Producto p2 = new Producto();
        System.out.println("\nNombre del objeto p2: "+p2.getNombre());
        System.out.println("Precio del objeto p2: "+p2.getPrecio());
        System.out.println("Stock del objeto p2: "+p2.getStock());

        p2.setNombre("cartuchera");
        if( p2.setPrecio(-5.5))
            System.out.println("Valor del precio modificado");
        else
            System.out.println("no ha sido posible modificar el precio porque el dato ingresado es inválido");

        p2.setStock(12);
        System.out.println("\nNombre del objeto p2: "+p2.getNombre());
        System.out.println("Precio del objeto p2: "+p2.getPrecio());
        System.out.println("Stock del objeto p2: "+p2.getStock());


        System.out.println("\nDatos del objeto p1\n"+p1);

    }
}
