public class EmpleadoEfectivo extends Empleado{
    
    private int sueldo;
    private int antiguedad;

    public EmpleadoEfectivo(int dni, String nombre, String apellido, int sueldo, int antiguedad){ //constructor
        super(dni, nombre, apellido); //super para llamar constructor padre, ya que si llamamos a dni no se va a poder por que esta encapsulado 
        this.antiguedad = antiguedad;
        this.setSueldo(sueldo);
    }

    public int getSueldo() {
		return sueldo;
	}

	public int setSueldo(int sueldo) {
		this.sueldo = sueldo;
		return sueldo;
	}

	@Override  //sobreescritura emtodo heredado 
    public int calcularSueldo(){
        return (this.sueldo + (this.antiguedad * 1000));  //metodo heredado
    }


}
