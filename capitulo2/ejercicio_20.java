
package capitulo2;

import java.util.Scanner;

public class ejercicio_20 {
    public static void main(String[] args) {
        double i,b,r;
        Scanner leer=new Scanner (System.in);
        System.out.print("Ingrese el balance y la razon: ");
        b=leer.nextDouble();
        r=leer.nextDouble();
        i=b*(r/1200);
        System.out.println("el interes es "+String.format("%.5f",i));
    }
}
