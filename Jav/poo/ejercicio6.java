package poo;

public class ejercicio6 {
	public String Nombre;
	public float Sueldo;
	
	public ejercicio6(){
		Nombre="";
		Sueldo=0;
	}
	public String Salario(){
		if (Sueldo>=30000) {
            return"tu sueldo supera los 30000, usdted debe pagar impuestos";
            }
		else {
			return "usted no debe pagar impuestos";
		}
	}
}