
package capitulo2;

import java.util.Scanner;

public class ejercicio_15 {
    public static void main(String[] args) {
        double x1,x2,y1,y2,r,a;
        Scanner leer=new Scanner (System.in);
        System.out.print("Ingrese x1 y y1: ");
        x1=leer.nextDouble();
        y1=leer.nextDouble();
        System.out.print("Ingrese x2 y y2: ");
        x2=leer.nextDouble();
        y2=leer.nextDouble();
        a=Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        r=Math.pow(a,0.5);
        System.out.println("La distancia entre los dos puntos es: "+r);
    }
}
