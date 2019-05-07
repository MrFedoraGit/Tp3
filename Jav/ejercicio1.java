import java.util.Scanner;
public class ejercicio1{
	public static void main(String[] args) 
	{
		Scanner teclado=new Scanner(System.in);
		int cantidad;
		float precio;
		float importe;
		System.out.println("ingrese la cantidad de producto");
		cantidad=teclado.nextInt();
		System.out.println("ingrese el valor unitario del producto");
		precio=teclado.nextFloat();
		importe=precio * cantidad;
		System.out.println("le importe a pagar es:");
		System.out.println(importe);
	}
}