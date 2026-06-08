package herencia.herpersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cedula = null, nombre = null, universidad = null, carrera = null,especialidad= null,tesis = null;
        int opc;
        double valorHora;
        List<Persona> listado = new ArrayList<Persona>();
        do{
            menu();
            System.out.print("Ingrese un opcion: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:{
                    //leer los datos
                    listado.add(new AlumnoPregrado(cedula,nombre,universidad,carrera));
                }break;
                case 4:{
                    for(Persona p : listado){

                        System.out.println(p);
                    }
                }break;
                case 8:{
                    //preguntar el valor por hora
                    //cedula, nombre,horas,salario
                    //valor total pagado por salarios
                }
            }

        }while(opc != 9);


    }
    public static void menu(){
        System.out.println("1. Ingresar alumno pregrado");
        System.out.println("2. Ingresar alumno magister");
        System.out.println("3. Ingresar profesor hora");
        System.out.println("4. Mostrar todo el listado");
        System.out.println("5. Mostrar alumno pregrado");
        System.out.println("6. Mostrar alumno magister");
        System.out.println("7. Mostrar profesor hora");
        System.out.println("8. Pagar nomina");
        System.out.println("9. Salir");
    }
}
