
package capitulo2;

import java.util.Scanner;

public class ejercicio_12 {
    public static void main(String[] args) {
        double v,a,l;
        Scanner read=new Scanner (System.in);
        System.out.println("Ingrese velocidad y aceleracion: ");
        v=read.nextDouble();
        a=read.nextDouble();
        l=(v*v)/(2*a);
        System.out.println("El minimo valor es: "+String.format("%.3f",l));
    }
}
