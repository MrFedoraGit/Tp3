package poo;
import java.util.Scanner;
public class ejercicioseis {
	public static void main(String[] args) {
		ejercicio6 Empleado=new ejercicio6();
		Scanner tecl=new Scanner(System.in);
		String empleado;
		float sueldo;
		System.out.println("ingrese el nombre del empleado");
		empleado=tecl.nextLine();
		System.out.println("ingrese el sueldo del empleado");
		sueldo=tecl.nextFloat();
		Empleado.Nombre=empleado;
		Empleado.Sueldo=sueldo;
		System.out.println("el nombre del empleado es: "+ Empleado.Nombre);
		System.out.println("el suedo del empleado es: "+ Empleado.Sueldo);
		System.out.println(Empleado.Salario());
	}

}
