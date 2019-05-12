
package capitulo2;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        double f,m;
        System.out.println("Ingrese el valor: ");
        Scanner x=new Scanner (System.in);
        f=x.nextDouble();
        m=f*0.305;
        System.out.println(f+" pies eequivale a "+m+" metros");
    }
}
