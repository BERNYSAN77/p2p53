package ejerproducto.interfaz;

import javax.swing.*;
import java.util.Scanner;

public class MainLectura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String next() o nextLine()
        String nombre, apellidoPaterno, pais;
        float salario;
        //System.out.print("Ingrese su nombre: ");
        //nombre = sc.nextLine();
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        System.out.print("Ingrese su apellido: ");
        apellidoPaterno = sc.nextLine();
        System.out.print("Ingrese su salario: ");
        //salario = sc.nextFloat();
        salario = Float.parseFloat(sc.nextLine());
        System.out.print("Ingrese el pais de residencia: ");
        pais = sc.nextLine();
        /*System.out.println("Su nombre completo es: "+nombre+" "+apellidoPaterno);
        System.out.println("Su salario "+salario);
        System.out.println("su país de residencia: "+pais);*/
        JOptionPane.showMessageDialog(null,"Su nombre completo es: "+nombre+" "+apellidoPaterno+
                "\nSu salario "+salario+"\nsu país de residencia: "+pais);


    }
}
