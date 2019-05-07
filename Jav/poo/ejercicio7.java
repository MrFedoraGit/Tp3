package poo;

public class ejercicio7 {
	public int a;
	public int b;
	public int resul;

	
	public void Suma(int a, int b) {
		resul=a+b;
		System.out.print("la suma de "+a+" y "+b+" es igual a: "+resul);
	}
	public void Resta(int a, int b) {
		resul=a-b;
		System.out.print("la resta de "+a+" y "+b+" es igual a: "+resul);
	}
	public void Multi(int a, int b) {
		resul=a*b;
		System.out.print("el producto de "+a+" y "+b+" es igual a: "+resul);
	}
	public void Divi(int a, int b) {
		if(b==0) {
			resul=0;
			System.out.println("no se puede dividir un numero por 0(cero)");
		}
		else {
			resul=a/b;
			System.out.print("la division entre "+a+" y "+b+" es igual a: "+resul);
		}
	}

}
