
public abstract class Empleado {

    private int dni;
    private String nombre;
    private String apellido;


    //CREAMOPS CONSTRUCTOS DENTRO DE UNA CLASE
    public Empleado(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;             //THIS ES MUY PARECIDO A SELF EN PYTHON ES PARA MOSTRAR EN QUE OBJETO ESTAMOS PARADO
        this.apellido = apellido;                        
    }


    public abstract int calcularSueldo(); //establece un contrato de lo que tiene que heredar los hijos de la esta superclase
        


    //Metodo set para cambiar el objeto o variable desde afuera de la clase ya que es private
   // public void setNombre(String nombre) {
     //   this.nombre = nombre;
    //}


    @Override
    public String toString(){           //clases mayuscula metodos minuscula CAMELCASE
        return String.valueOf(this.dni) + " - " +  this.nombre 
        + " - " + this.apellido; //ESTA EXPRESION SIRVE PARA CAMBIAR EL TIPO DE LA VARIABLE
    }
}
