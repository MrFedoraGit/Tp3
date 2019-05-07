package poo;
import java.util.Scanner;
public class ejerciciosiete {
	public static void main(String[] args) {
		ejercicio7 Cuenta=new ejercicio7();
		Scanner tecl=new Scanner(System.in);
		int num1;
		int num2;
		int ope;
		System.out.println("ingrese el primer numero");
		num1=tecl.nextInt();
		System.out.println("ingrese el segundo numero");
		num2=tecl.nextInt();
		System.out.println("ingrese la operacion que quiera realizar");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicar");
		System.out.println("4) Dividir");
		ope=tecl.nextInt();
		if(ope==1) {
			Cuenta.Suma(num1, num2);
		}else if(ope==2) {
			Cuenta.Resta(num1, num2);
		}else if(ope==3) {
			Cuenta.Multi(num1, num2);
		}else if(ope==4) {
			Cuenta.Divi(num1, num2);
		}else {
			System.out.print("la cuenta solicitada no esta disponible");
		}
	}

}
