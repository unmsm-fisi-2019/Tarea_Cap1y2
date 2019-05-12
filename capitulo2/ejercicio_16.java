
package capitulo2;

import java.util.Scanner;

public class ejercicio_16 {
    public static void main(String[] args) {
        double s,r;
        Scanner leer=new Scanner (System.in);
        System.out.print("Ingrese el lado del hexagono: ");
        s=leer.nextDouble();
        r=(3*(Math.pow(3,0.5))*(Math.pow(s,2)))/2;
        System.out.println("el area es: "+String.format("%.4f",r));
    }
}
