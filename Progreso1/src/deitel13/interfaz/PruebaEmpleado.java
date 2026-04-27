package deitel13.interfaz;

import deitel13.negocio.Empleado;

import javax.swing.*;

public class PruebaEmpleado {
    public static void main(String[] args) {
        String nombre,apellido;
        double salario,aumento;
        Empleado e1;
        Empleado e2;
        nombre= JOptionPane.showInputDialog("Ingrese el nombre: ");
        apellido=JOptionPane.showInputDialog("Ingrese el apallido: ");
        salario=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario:"));
        e1=new Empleado(nombre,apellido,salario);
        nombre= JOptionPane.showInputDialog("Ingrese el nombre: ");
        apellido=JOptionPane.showInputDialog("Ingrese el apallido: ");
        salario=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario:"));
        e2=new Empleado(nombre,apellido,salario);
        System.out.println("El saliorio anual del empleado 1 es: "+e1.getSalario()*12);
        aumento = e1.getSalario()*1.1;
        e1.setSalario(aumento);
        e2.setSalario(e2.getSalario()*1.1);
    }
}
