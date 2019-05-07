package poo;

public class Comercial extends Empleado{

    private double comision;

    public Comercial(){
        this.comision=0;
    }

    public Comercial(String nombre, String apellido, int edad, double salario, double comision) {
        super(nombre, apellido, edad, salario);
        this.comision=comision;
    }
}