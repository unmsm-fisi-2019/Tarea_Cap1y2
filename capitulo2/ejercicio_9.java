
package capitulo2;

import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args) {
        double vo,v1,t,a;
        Scanner x=new Scanner (System.in);
        System.out.println("ingrese v0, v1 y t: ");
        vo=x.nextDouble();
        v1=x.nextDouble();
        t=x.nextDouble();
        a=(v1-vo)/t;
        System.out.println("la aceleracion es: "+String.format("%.4f",a));
    }
}
