package ejerproducto.negocio;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
       /* this.precio = precio;
        this.stock = stock;*/
        setPrecio(precio);
        setStock(stock);
    }

    public Producto(){
        /*se puede dejar vacio o escribir los valores
        valores pueden ser los por defectod e java
                null si es un objeto de una clase
                0 si es un valor numérico
                false si es un boolean
         inicializar en valores que el problema indique que es el por defecto
        */


    }

    /*
    métodos get (sacar información)
    siempre retorna valor -> generalmente será del mismo tipo de mi atributo
    serán por cada atributo (considerar el atributo)
     */
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }

    /*
    métodos set (reemplazar el valor anterior)
    generalmente void
    siempre reciben parámetro -> generalmente es del mismo tipo del atributo
     */

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public boolean setPrecio(double precio){
        if (precio > 0){
            this.precio = precio;
            return true;
        }
        return false;
    }
    public void setStock(int stock){
      /*  if(stock < 0){
            stock = 0;
        }
        this.stock = stock;*/

        this.stock = Math.max(stock,0);
    }
}
