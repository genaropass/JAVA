public class ServicioSueldo{

    public static void main (String[] args){
        Empleado emp1 = new EmpleadoEfectivo(40817573, "Genaro", "Passero", 40000, 2); 
        Empleado emp2 = new EmpleadoJornada(40818984, "Agustin", "Passero", 100, 500);    //POR MEDIO DEL NEW LLAMO UN CONSTRUCTOR  //Respetar el orden de las variables
        //emp1.setNombre("Tupe");
        //System.out.println(emp1.toString());
        //System.out.println(emp2.toString());
        System.out.println(emp1.calcularSueldo());
        System.out.println(emp2.calcularSueldo());
    }
}