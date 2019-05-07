package poo;

public class Persona {
 
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void VerDatos() {
    	System.out.print("nombre: "+nombre+".edad: "+edad);
    }
}