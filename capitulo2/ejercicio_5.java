
package capitulo2;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        double s,r,a;
        System.out.println("Enter the subtotal and gratuity rate: ");
        Scanner l=new Scanner (System.in);
        s=l.nextDouble();
        r=l.nextDouble();
        a=s*(r/100);
        s+=a;
        System.out.println("The gratuity is $"+a+" and total is $"+s);
    }
}
