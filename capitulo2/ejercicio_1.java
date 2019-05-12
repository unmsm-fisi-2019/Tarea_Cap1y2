
package capitulo2;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        double a,temp;
        Scanner leer = new Scanner (System.in);
        System.out.println("Inrese la temperatura en Celsius");
        a=leer.nextDouble();
        temp=(double) ((9.0/5)*a)+32;
        System.out.println(a+"Celsius es "+temp+"Fahrenheit");
    }
}
