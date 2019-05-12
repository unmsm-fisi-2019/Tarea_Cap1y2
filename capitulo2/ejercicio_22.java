 
package capitulo2;

import java.util.Scanner;

public class ejercicio_22 {
    public static void main(String[] args) {
        int a,b;
        Scanner leer=new Scanner(System.in);
        a=leer.nextInt();
        b=a%100;
        a=(a-b)/100;
        System.out.println(a+" dolares y "+b+" cenntavos");
    }
}
