package capitulo2;

import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        double m,ti,tf,q;
        Scanner a=new Scanner (System.in);
        System.out.println("Ingrese la cantidad de agua en kilogramos: ");
        m=a.nextDouble();
        System.out.println("Ingrese la temperatura inicial");
        ti=a.nextDouble();
        System.out.println("Ingrese la temperatura final: ");
        tf=a.nextDouble();
        q=m*(tf-ti)*4184;
        System.out.println("la eneria es: "+q);
    }
}
