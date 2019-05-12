
package capitulo2;

import java.util.Scanner;

public class ejercicio_13 {
    public static void main(String[] args) {
        double x,i,n,rate;
        Scanner leer=new Scanner (System.in);
        x=0;
        rate=0.05/12;
        System.out.println("Ingrese el monto mensual: ");
        n=leer.nextDouble();
        for(i=1;i<=6;i++){
            x=(n+x)*(1+rate);
        }
        System.out.println("El valor es: "+String.format("%.2f",x));
    }
}
