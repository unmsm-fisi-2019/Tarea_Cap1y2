
package capitulo2;

import java.util.Scanner;

public class ejercicio_14 {
    public static void main(String[] args) {
        double w,h,x;
        Scanner leer=new Scanner (System.in);
        w=leer.nextDouble();
        h=leer.nextDouble();
        x=(w*0.45359237)/(Math.pow(h*0.0254,2));
        System.out.println("BIM="+String.format("%.4f",x));
    }
}
