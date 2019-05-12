
package capitulo2;

import java.util.Scanner;

public class ejercicio_23 {
    public static void main(String[] args) {
        double d,m,c,r;
        Scanner leer=new Scanner (System.in); 
        System.out.println("Ingrese la distancia a recorrer: ");
        d=leer.nextDouble();
        System.out.println("Ingrese las millas por galon: ");
        m=leer.nextDouble();
        System.out.println("Ingrese el precio del galon: ");
        c=leer.nextDouble();
        r=(d/m)*c;
        System.out.println("El costo es $"+String.format("%.2f",r));
    }
}
