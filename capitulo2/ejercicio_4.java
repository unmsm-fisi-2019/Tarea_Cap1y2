
package capitulo2;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        double x,k;
        Scanner a=new Scanner (System.in);
        System.out.println("Ingrese la canidad de libras: ");
        x=a.nextDouble();
        k=x*0.454;
        System.out.println(x+" libras es "+k+" kiogramos");
    }
}
