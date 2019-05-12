
package capitulo2;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
         double rad,a,v,l;
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el radio y largo del ciindro: ");
        rad=leer.nextDouble();
        l=leer.nextInt();
        a=rad*rad*Math.PI;
        v=a*l;
        System.out.println("El  area es: "+String.format("%.4f",a));
        System.out.println("El volumen es "+String.format("%.1f",v));
    }
}
