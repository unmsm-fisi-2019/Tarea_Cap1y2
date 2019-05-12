
package capitulo2;

import java.util.Scanner;

public class ejercicio_21 {
    public static void main(String[] args) {
        double a,b,c,d;
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el monto: ");
        a=leer.nextDouble();
        System.out.println("Ingrese el interes: ");
        b=leer.nextDouble();
        System.out.println("Ingrese el numero de años: ");
        c=leer.nextDouble();
        b=(double)(b/1200)+1;
        c=c*12;
        d=a*(Math.pow(b,c));
        System.out.println("El valor acumulado es $"+String.format("%.2f",d));
    }
}
