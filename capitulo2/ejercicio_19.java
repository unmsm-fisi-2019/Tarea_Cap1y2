
package capitulo2;

import java.util.Scanner;

public class ejercicio_19 {
    public static void main(String[] args) {
        double x1,x2,y1,y2,x3,y3,s,l1,l2,l3,r,a;
        Scanner leer=new Scanner (System.in);
        System.out.print("Ingrese los vertices del triangulo: ");
        x1=leer.nextDouble();
        y1=leer.nextDouble();
        x2=leer.nextDouble();
        y2=leer.nextDouble();
        x3=leer.nextDouble();
        y3=leer.nextDouble();
        l1=Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        l1=Math.pow(l1,0.5);
        l2=Math.pow(x3-x2,2)+Math.pow(y3-y2,2);
        l2=Math.pow(l2,0.5);
        l3=Math.pow(x3-x1,2)+Math.pow(y3-y1,2);
        l3=Math.pow(l3,0.5);
        s=(l1+l2+l3)/2;
        a=s*(s-l1)*(s-l2)*(s-l3);
        r=Math.pow(a,0.5);
        System.out.println("El area del triangulo es: "+String.format("%.1f",r));
    }
}
