package poo;

public class Empleado extends Persona{

	double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo=0;
    }
    public void VerDatosE (String nombre, int edad, double sueldo) {
    	System.out.print("sueldo: " + sueldo);
    }
}
/*package poo;

public class Empleado {
 
    protected String nombre;

    protected int edad;
    protected double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public boolean plus (double sueldoPlus){
        boolean aumento=false;
        if (edad>40 && compruebaNombre()){
            salario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }

    private boolean compruebaNombre(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }

    public Empleado(){
        this ("", "", 0, 0);
    }

    public Empleado(String nombre, String apellido, int edad, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }
}*/