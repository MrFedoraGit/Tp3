import java.util.Scanner;

public class ejercicio3{
    public static void main(String[]ar) {
        int f;
        Scanner teclado=new Scanner(System.in);
        System.out.println("ingresar un 10 numeros enteros:");

             for(f=1;f<=10;f++) {
                System.out.println("*"); 
                System.out.println("numero:");
                f=teclado.nextInt();
                if (f%2==0) {
                     System.out.println("El numero ingresado es par");
                     }
                      else if (f%2==1) {
                     System.out.println("El numero ingresado no es par");
                     } else {
                     System.out.println("Ingrese un valor valido");
                     }
             }
             }
            }