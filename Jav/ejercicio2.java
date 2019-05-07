import java.util.Scanner;

public class ejercicio2{
    public static void main(String[]ar) {
        
        Scanner teclado=new Scanner(System.in);
         int numero;
         System.out.print("ingresar un numero entero positivo:");
         numero=teclado.nextInt();
         if (numero>0) {
             System.out.print("ha ingresado un numero correcto");
             }
             else if (numero==0) {
             System.out.print("El numero debia ser positivo");
             } else {
             System.out.print("Por favor ingresar numero que solicita");
             } 
    }

}